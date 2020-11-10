package com.rest.demo.sum;

public class selfAddMinus {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int x=2*++a;//先a自加1，然后再相乘
        int y=2*b++;//先乘，b在加1
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    }
}
