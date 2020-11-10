package com.rest.demo.sum;

public class Empname3 {
    //salary是静态的私有变量
    private static double salary;
    //name是一个常量
    public static final String name = "java工程师";

    public static void main(String[] args) {
        salary =10000;
        System.out.println(name+"平均工资"+salary);
    }
}
