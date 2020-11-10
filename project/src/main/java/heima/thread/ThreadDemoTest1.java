package heima.thread;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/23 18:08
 *
 */

/**
 * 多线程的实现方式
 *  方式一 一种是将该类声明为Thread的子类，重写Thread类的run方法 ，然后创建该类的实例并启动
 */
public class ThreadDemoTest1 {
    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo();
        threadDemo.setName("张无忌");
        threadDemo.start();

        ThreadDemo threadDemo1=new ThreadDemo();
        threadDemo1.setName("殷素素");
        threadDemo1.start();
    }


}
