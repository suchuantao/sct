package com.rest.demo.sum;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();//获取当前时间
        int year =c.get(Calendar.YEAR);//获取年份
        System.out.println(year);//打印年份
        int month = c.get(Calendar.MONTH)+1;//获取月份
        System.out.println(month);//打印月份
        int day = c.get(Calendar.DATE);//获取日期
        System.out.println(day);//打印日期
        int hour = c.get(Calendar.HOUR);//获取小时
        System.out.println(hour);
        int minute = c.get(Calendar.MINUTE);//获取分钟
        System.out.println(minute);
        int second =c.get(Calendar.SECOND);//获取秒
        System.out.println(second);
        int day1 = c.get(Calendar.DAY_OF_WEEK);//获取星期几，1代表星期日、2代表星期1、3代表星期二，以此类推
        System.out.println(day1);

    }
}
