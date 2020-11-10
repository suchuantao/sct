package com.rest.demo.sum;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a , b;
        a=10;
        //如果a=1成立，设置b的值为20，否则为30；
        b=(a==1)?20:30;
        System.out.println(b);
        //如果a=10成立，设置b的值为20，否则为30；
        b=(a==10)?20:30;
        System.out.println(b);
    }
}
