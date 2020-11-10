package com.rest.demo.sum;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        System.out.println("格式化当前时间:"+sf.format(date));
        System.out.println(date.toString());
        //全部日期和时间信息
        System.out.printf("全部日期和时间信息：%tc",date);
        //打印换行
        System.out.println("\n");
        //输出年-月-日格式
        System.out.printf("输出年-月-日格式:%tF",date);
        //打印换行
        System.out.println("\n");
        //输出日-月-年格式
        System.out.printf("输出日-月-年格式：%tD",date);
        //打印换行
        System.out.println("\n");
        //"HH:MM:SS PM"格式（12时制）
        System.out.printf("输出HH:MM:SS PM格式：%tr",date);
        //打印换行
        System.out.println("\n");
        //输出时间24小时制
        System.out.printf("输出时间24小时制%tT",date);
        //打印换行
        System.out.println("\n");
        //输出时间为时分：例如：14:28
        System.out.printf("%tR",date);





    }
}
