package heima.thread;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/26 10:57
 */


/**
 * 模拟火车站售票
 *  分析
 *      火车票总数，每出售一张少一张
 *      火车票的数量小于1 停止售票
 *      使用多线程模拟多个售票窗口
 *      火车票售完票，火车票窗口不关门
 *
 * synchronization 同步 可以修饰和同步代码块，被修饰的代码块和方法一旦被某个线程访问，则直接锁住，其他线程无法访问
 *
 * 同步代码块 ：
 * synchronization（锁对象）{
 *
 * }
 * 注意：锁对象需要被所有线程所共享
 *
 * 注意：非静态同步方法的锁对象是this
 *       静态的同步方法锁对象是字节码对象
 *
 */
public class TickteDemo implements Runnable {
    int ticete=500;//火车票数量

    public void run() {
        while (true){
            //同步代码块，给线程上锁，保持数据唯一性，被访问的数据不重复
           //调用同步方法
                method();


        }

    }

    /**
     * 同步方法 给线程上锁，保持数据唯一性，被访问的数据不重复
     * 非静态同步方法
     */

    public synchronized void method() {
        //当火车票数量大于0时，执行售票，小于0时终止
        if(ticete>0){
            ticete--;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //调用Thread的currentThread获取线程对象，然后调用getName方法获取线程名称
            Thread thread=Thread.currentThread();
            String getName= thread.getName();
            System.out.println(getName+" "+ticete);

        }
    }
}
