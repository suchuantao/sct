package heima.jinjie.array.object.interface0.interfce01;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/10/9 14:31
 */

/**
 * 接口：接口是比抽象类还抽象，接口里面所有的方法全是抽象方法，接口和类的关系是实现，implement
 * 接口特点：只能有抽象方法
 *          只能有常量
 *          默认使用public和abstrace修饰方法
 *          默认使用public,static，final修饰成员变量
 * 注意：接口不能创建对象（不能实例化）
 *      接口与类的关系是实现，一个类实现一个接口必须实现它所有的方法
 * 类与类：继承关系，单一继承，多层继承
 * 类与接口：实现关系，多实现，一个类可以实现多个接口
 * 接口与接口：继承关系，多继承
 * 接口与抽象类区别：
 *  共性：
 *      A 不断的抽取，抽取出抽象的概念
 *  区别：
 *      与类的关系：
 *          类与接口是实现关系。而且是多实现，一个类可以多个接口
 *      与抽象类是继承关系，java中的继承是单一继承，一个类只能有一个父类，java中的继承是多层继承
 *      成员变量：
 *          抽象类可以有成员变量，也可以有常量
 *          接口只能有常量
 *      成员方法
 *          抽象类可以有抽象方法，也可以有非抽象方法
 *          接口只能有抽象方法，而且方法有默认的修饰符 public abstract
 *      构造方法
 *          抽象类有构造方法
 *          接口没有构造方法
 *
 */
public interface InterfaceDemo1 {
    //接口成员变量
    public static final int num =10;
    //接口抽象方法
    public abstract void eat();
}
