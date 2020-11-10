package com.rest.demo.sum;

public class TestMax {


    public static int max ( int a ,int b){

        return  a>b ? a : b;//三元表达式
        }



    public static void main(String[] args) {
        int i = 2;
        int j = 5;
        int k =max(i,j);
        System.out.println(i+"和"+j+"比较，最大值为："+k);
    }
}
