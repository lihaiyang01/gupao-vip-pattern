1、思考并总结装饰者模式和适配器模式的根本区别。
装饰者模式：动态的为对象附加功能，但不改变对象本身
适配器模式：是将一个已存在类的接口转化为客户期望的接口来适配原本不兼容的情况，有点亡羊补牢的感觉
装饰者模式特点：
1.装饰者和被装饰者实现同一个接口，装饰者拥有被装饰者的引用
2.可以用多个装饰者来包装一个对象，装饰类可以包装装饰类和被装饰对象
3.装饰者可以在装饰前后加上自己的逻辑