package com.rest.demo.sum;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean a =false;
        boolean b =true;
        System.out.println("a&&b=:"+(a&&b));//逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
        System.out.println("a||b=:"+(a||b));//逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。
        System.out.println("!a||b=:"+(!a||b));//辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。

         int c = 5;
         boolean d = (c<4&&(c++<10));//该程序使用到了短路逻辑运算符(&&)，首先判断 c<4 的结果为 false，
        // 则 d 的结果必定是 false，所以不再执行第二个操作 c++<10 的判断，所以 c 的值为 5。
        System.out.println("使用短路逻辑运算符的结果为："+c);
        System.out.println("d的结果为："+d);
    }
}
