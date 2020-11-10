package heima.jinjie.array.object.innerdemo;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/13 10:46
 */

/**
 * 匿名内部类
 * 可以把匿名内部类看作成一个没有名字的局部内部类
 * 定义在方法中
 * 必须在定义匿名内部类的时候创建对象
 * 格式：
 * new 类/接口(){
 * 如果创建了继承这个类的子类，我们可以重写父类的方法
 * 如果是创建了实现这个接口的子类对象，我们必须实现该接口的所有方法
 * };
 * 原理：而是创建了继承这个类的子类对象或者是创建了实现这个接口的子类对象
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();


    }

    interface Inner {
        public abstract void fuction();

    }

    static class Outer {
        public void method() {
            Inner i = new Inner() {
                public void fuction() {
                    System.out.println("function");
                }
            };
            i.fuction();
        }
    }
}
