package heima.thread;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/26 10:09
 */
public class ThreadDemoTest2 {
    public static void main(String[] args) {
        //创建线程实例
        ThreadDemo2 threadDemo2=new ThreadDemo2();
        //创建Thread实例对象，然后把实现了Runnable接口对象作为参数传递进来
        Thread thread=new Thread(threadDemo2);
        thread.setName("张翠山");
        //启动线程
        thread.start();

        ThreadDemo2 threadDemo21=new ThreadDemo2();
        Thread thread1=new Thread(threadDemo21);
        thread1.setName("谢逊");
        thread1.start();
    }
}
