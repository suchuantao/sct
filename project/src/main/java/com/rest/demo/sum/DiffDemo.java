package com.rest.demo.sum;

import java.util.Date;

public class DiffDemo {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();//计算方式与时间的单位转换
            Date date1 = new Date();
            System.out.println(date1);
            Thread.sleep(60*60*10);
            long end = System.currentTimeMillis();
            Date date2 = new Date();
            System.out.println(date2);
            long diff =start-end;
            System.out.println(diff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
