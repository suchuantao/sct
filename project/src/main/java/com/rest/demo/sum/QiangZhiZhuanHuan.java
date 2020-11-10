package com.rest.demo.sum;

public class QiangZhiZhuanHuan {
    public static void main(String[] args) {
        int i1 = 42;
        byte b1 = (byte)i1;//强制将int类型转换成byte类型
        System.out.println("int类型强制转换成byte的值为："+b1);

        long l2 = 32L;
        int i2 = (int)l2;//强制将long类型转换成int类型
        System.out.println("long类型强制转成为int类型值为："+i2);

        double d3 = 23d;
        char c3=(char)d3;
        System.out.println(c3);

        double d4 = 23d;
        float f4 = (float) d4;
        System.out.println("double类型转换为float类型值为："+f4);

        double d5 =232d;
        int i5 = (int)d5;
        System.out.println("double类型转换成int类型值为："+i5);
    }


}
