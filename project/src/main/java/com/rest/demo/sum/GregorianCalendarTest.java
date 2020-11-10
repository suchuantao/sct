package com.rest.demo.sum;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(Calendar.MONTH)+1);//获取月份
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_WEEK));//获取星期，1代表星期日，2代表星期一，以此类推
        System.out.println(gregorianCalendar.get(GregorianCalendar.DATE));
    }
}
