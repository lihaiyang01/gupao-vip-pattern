package com.gupao.vip.pattern.prototype.bean;

import java.io.*;
import java.util.List;

/**
 * 班级
 */
public class Clazz implements Cloneable, Serializable {

    private static final long serialVersionUID = -1458201582787511420L;
    private String name;

    private Integer code;

    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //浅拷贝
        /*Clazz clazz = new Clazz();
        clazz.setName(this.getName());
        clazz.setCode(this.getCode());
        clazz.setStudents(this.getStudents());
        return clazz;*/
        try{
            //深拷贝
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Clazz clazz1 = (Clazz)ois.readObject();
            return clazz1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
