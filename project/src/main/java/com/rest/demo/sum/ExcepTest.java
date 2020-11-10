package com.rest.demo.sum;

public class ExcepTest {
    public static void main(String[] args) {
        int a []= new int[2];
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {//用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。抛出该异常
            System.out.println(e);
        }
        finally{
            a[0]=6;
            System.out.println(a[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("Out of the block");
    }
}
