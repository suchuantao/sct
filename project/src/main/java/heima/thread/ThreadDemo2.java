package heima.thread;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/26 10:09
 */

/**
 * 多线程实现方式二
 *  实现Runnable接口，重写run方法
 */

public class ThreadDemo2 implements Runnable {
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            //返回对当前正在执行的线程对象的引用，调用Thread的currentThread方法获取到线程对象
            Thread thread=Thread.currentThread();
            //获取到线程的名字
            String getName= thread.getName();
            System.out.println(getName+" "+i);
        }
    }
}
