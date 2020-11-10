package com.rest.demo.sum;

public class ZiDongLeiZhuan {
    public static void main(String[] args) {
        char c1='a';
        int i1=c1;
        System.out.println("char类型的值转换成int的值为："+i1);
        char c2='C';
        int i2=c2+3;
        System.out.println("char类型与int类型值计算的值为："+i2);

        int i3= 54;
        long l3=i3+32;
        System.out.println("int类型转成成long类型相加的值为："+l3);

        float f4 = 100.00f;
        double d4 = f4;
        System.out.println("float类型转换double类型值为："+d4);
    }
}
