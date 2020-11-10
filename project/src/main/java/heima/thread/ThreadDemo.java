package heima.thread;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/23 17:02
 */

/**
 * 多线程
 *  进程 当前正在运行的程序，一个应用程序在内存中执行的区域
 *  线程 进程中的一个执行单元，执行路径
 *
 *  一个进程可以有一个线程，也可以有多个线程
 * 单线程 安全性高 效率低
 * 多线程 安全性低 效率高
 *
 * 多线程实现方式一
 *  集成Thread  实现run方法
 */
public class ThreadDemo extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+""+i);
        }
    }

}
