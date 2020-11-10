package com.rest.demo.sum;

public class TestArray2 {
    public static void main(String[] args) {
        double [] array = {1.2,5.2,4.3,24.3,33,3,55.1,66.666};
        //打印所有数组方法一
        for (int i = 0; i <array.length; i++) {
            System.out.println("打印数组中的元素1："+array[i]);
        }
        //打印所有数组方法二
        for (double a:array){
            System.out.println("打印数组中所有元素2："+a);

        }
        //计算所有元素之和
        double total=0;
        for (int i = 0; i <array.length ; i++) {
            total+=array[i];

        }
        System.out.println("元素之和为:"+total);

        //查找最大的元素
        double max =array[0];
        for (int i = 0; i <array.length; i++) {
            if(array[i]>max);max=array[i];
        }
        System.out.println( "数组中元素最大值为："+max);
    }
}
