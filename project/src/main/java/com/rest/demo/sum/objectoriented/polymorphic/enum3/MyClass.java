package com.rest.demo.sum.objectoriented.polymorphic.enum3;

//使用 for 语句来迭代枚举元素
public class MyClass {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }
}
