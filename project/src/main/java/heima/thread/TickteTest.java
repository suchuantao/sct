package heima.thread;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/26 10:57
 */
public class TickteTest {
    public static void main(String[] args) {
        TickteDemo tickteDemo=new TickteDemo();
        Thread thread1=new Thread(tickteDemo);
        Thread thread2=new Thread(tickteDemo);
        Thread thread3=new Thread(tickteDemo);
        Thread thread4=new Thread(tickteDemo);
        Thread thread5=new Thread(tickteDemo);
        Thread thread6=new Thread(tickteDemo);
        Thread thread7=new Thread(tickteDemo);
        Thread thread8=new Thread(tickteDemo);
        Thread thread9=new Thread(tickteDemo);
        Thread thread10=new Thread(tickteDemo);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread4.setName("窗口4");
        thread5.setName("窗口5");
        thread6.setName("窗口6");
        thread7.setName("窗口7");
        thread8.setName("窗口8");
        thread9.setName("窗口9");
        thread10.setName("窗口10");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
