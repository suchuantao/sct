package com.rest.demo.sum.objectoriented.polymorphic.enum2;
//内部类中使用枚举
public class Test {
    enum Color{
        RED,GREEN,BLUE;
    }

    public static void main(String[] args) {
        Color color =Color.RED;
        System.out.println(color);
    }
}
