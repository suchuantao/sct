package heima.jinjie.array.object.rewrite;
/*
* 继承中成员方法的特点：在子类与父类中，子类重写了父类方法（覆盖），当子类重写了父类的方法之后使用子类对象调用就是子类的方法
*
* */
public class Test {
    public static void main(String[] args) {
        //创建子类对象并调用子类的方法
        Kid kid=new Kid();
        kid.eat();
    }
}
