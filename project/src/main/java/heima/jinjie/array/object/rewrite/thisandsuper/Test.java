package heima.jinjie.array.object.rewrite.thisandsuper;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/9/29 17:57
 */

/**
 * this与super区别
 *   this 调用当前对象
 *      调用子类的成员变量
 *      调用子类的成员方法
 *      在子类的构造方法第一行默认调用子类其他的构造方法
 *   super 调用父类对象
 *      调用父类的成员变量
 *      调用父类的成员方法
 *      在子类构造方法第一行默认调用父类构造方法
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.function();
    }
}
