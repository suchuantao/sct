package heima.jinjie.array.object.abstarct;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/9/30 9:55
 */

/**
 * 抽象类：有抽象方法的类必须是抽象类
 * 抽象方法：不同类的方法类似，但是具体内容又不一样，所以我们只能抽取他们的申明，没有具体方法体的方法就是抽象方法
 * 注意：一个类继承了抽象类必须重写抽象方法,否则这个类也是抽象类
 * 抽象类特点：
 *  A 抽象方法只能在抽象类中
 *  B 抽象类和抽象方法必须被abstract修饰
 *  C 抽象类不能创建对象（不能被实例化）
 *  D 抽象类中可以有非抽象方法
 */
//抽象类
public abstract class AbstartDemo {
    String name="哮天犬";
    //抽象方法
    public abstract void eat();
//非抽象类子类可以不重写
    public void run(){

    }


    }

