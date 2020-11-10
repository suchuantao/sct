package com.rest.demo.sum;

public class StringDemo {
    public static void main(String[] args) {
        char [] helloArray ={'a','b','c','d','f','g','x','d'};
        String string =new String(helloArray);
        System.out.println(string);

        String site="www.runoob.com";
        int len=string.length();
        System.out.println("菜鸟课程网址长度为："+len);
    }
}
