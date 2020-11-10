package com.rest.demo.sum.objectoriented.polymorphic.enum5;

public class Test {
    public static void main(String[] args) {
        //调用values，返回枚举中所有值
        Color arr[]=Color.values();
        //迭代枚举
        for (Color color :arr){
            //查看索引
            System.out.println(color.ordinal());

        }
        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color.valueOf("BLUE"));
    }
}
