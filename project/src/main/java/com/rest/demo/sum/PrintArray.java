package com.rest.demo.sum;

public class PrintArray {
    public static void printArray(int [] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
            
        }

    }

    public static void main(String[] args) {

        printArray(new int[]{1,3,5,7,9,33,22,44,55,22,99});
    }
}
