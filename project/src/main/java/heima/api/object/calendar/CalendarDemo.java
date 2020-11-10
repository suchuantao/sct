package heima.api.object.calendar;

import java.util.Calendar;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/14 15:20
 */

/**
 * Calendar 日历 提供了一些操作日历的方法
 *  获取
 *  修改
 *  添加
 */
public class CalendarDemo {
    public static void main(String[] args) {
         method1();

         method2();

        method3();


    }

    /**
     * 在指定字段上加上相应的值
     */
    public static void method3() {
        Calendar calendar=Calendar.getInstance();
        //获取年份
        int year=calendar.get(Calendar.YEAR);

        //获取月份后默认加1才是当前月份
        calendar.add(Calendar.MONTH,1);
        //获取月份
        int month=calendar.get(Calendar.MONTH);
        //获取日期
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        //在指定日期字段上加上指定的值
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(year+"年"+month+"月"+day+"日");
    }

    /**
     * 使用calendar.set修改日期
     * @return
     */
    public static Calendar method2() {
        Calendar calendar=Calendar.getInstance();
        //获取年份
        int year=calendar.get(Calendar.YEAR);
        //获取月份
        int month=calendar.get(Calendar.MONTH)+1;

        //把日期修改到20日
        calendar.set(Calendar.DAY_OF_MONTH,20);
        //获取修改后的日期
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
        return calendar;
    }

    /**
     * 获取年月日
     * @return
     */
    public static Calendar method1() {
        //默认时区和语言环境获得一个日历。
        Calendar calendar=Calendar.getInstance();
        //获取年份
        int year=calendar.get(Calendar.YEAR);
        //获取月份
        int month=calendar.get(Calendar.MONTH)+1;
        //获取日期
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
        return calendar;
    }
}
