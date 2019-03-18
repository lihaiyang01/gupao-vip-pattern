package com.gupao.vip.pattern.proxy.dynamic.gpproxy;

import com.gupao.vip.pattern.proxy.bean.Zhangsan;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GPProxy {

    public static final String RN = "\r\n";

    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h){
        try {
            //1.动态生成源代码.java文件
            String src = generateSrc(interfaces);

            //2、Java文件输出磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
            //3、把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            //4、编译生成的.class文件加载到JVM中来
            Class<?> proxyClass = loader.loadClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(GPInvocationHandler.class);
            f.delete();
            //5、返回字节码重组以后的新的代理对象
            return constructor.newInstance(h);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuilder sb = new StringBuilder();
        sb.append("package com.gupao.vip.pattern.proxy.dynamic.gpproxy;" + RN);
        sb.append("import java.lang.reflect.*;" + RN);
        sb.append("public final class $Proxy0 implements " + interfaces[0].getName() + "{" + RN);
        sb.append("public GPInvocationHandler h;"+ RN);
        sb.append("public $Proxy0 (GPInvocationHandler h) {"+ RN);
        sb.append("  this.h = h;"+ RN);
        sb.append("}"+ RN);

        for (Method m : interfaces[0].getMethods()) {
            Class<?>[] parameterTypes = m.getParameterTypes();

            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();
            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> clazz = parameterTypes[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " +  paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");
                if(i > 0 && i < parameterTypes.length-1){
                    paramNames.append(",");
                    paramClasses.append(",");
                    paramValues.append(",");
                }
            }
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + paramNames.toString() + ") {" + RN);
            sb.append("try{" + RN);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{" + paramClasses.toString() + "});" + RN);
            sb.append((hasReturnValue(m.getReturnType()) ? "return " : "") + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",m.getReturnType()) + ";" + RN);
            sb.append("}catch(Error _ex) { }");
            sb.append("catch(Throwable e){" + RN);
            sb.append("throw new UndeclaredThrowableException(e);" + RN);
            sb.append("}");
            sb.append(getReturnEmptyCode(m.getReturnType()));
            sb.append("}");
        }
        sb.append("" + RN);
        sb.append("}");
        return sb.toString();
    }
    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }
    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }
    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }
    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }
    private static String toLowerFirstCase(String simpleName) {

        char[] chars = simpleName.toCharArray();
        chars[0]+=32;
        return String.valueOf(chars);
    }

}
