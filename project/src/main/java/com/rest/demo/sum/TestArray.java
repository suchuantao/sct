package com.rest.demo.sum;

public class TestArray {
    public static void main(String[] args) {
        //数组大小
        int size =10;
        double[] list =new double[size];
        list[0]=1.0;
        list[1]=3.2;
        list[2]=4;
        list[3]=3.22;
        list[4]=4.3;
        list[5]=8.9;
        list[6]=9.2;
        list[7]=8.2;
        list[8]=6.9;
        list[9]=5.5;
        //计算总和
        double total=0;
        for (int i = 0; i <size ; i++) {
            total+=list[i];
            
        }
        System.out.println("总和为："+total);
    }
}
