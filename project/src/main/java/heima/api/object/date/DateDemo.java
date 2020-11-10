package heima.api.object.date;

import java.util.Date;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/14 9:28
 */

/**
 * Date 表示瞬间精确到毫秒，可以通过方法来设定自己所表示的时间，可以表示任意时间
 * 构造方法
 *  Date() 创建一个表示系统当前时间的Date对象
 *  Date(long date) 根据“指定时间”创建Date对象
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);//Wed Oct 14 09:29:46 CST 2020
        System.out.println(date.toLocaleString());

        Date date1=new Date(1000*60*60*24);
        System.out.println(date1.toLocaleString());

        //获取当前系统时间
        Date date2=new Date();
        long d2= date2.getTime();
        System.out.println(d2);

        //设置时间
        Date date3=new Date();
        date3.setTime(1000*60*60*24);
        System.out.println(date3.toLocaleString());
    }
}
