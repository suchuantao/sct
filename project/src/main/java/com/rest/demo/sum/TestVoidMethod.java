package com.rest.demo.sum;

public class TestVoidMethod {
    public static void main(String[] args) {
        printGrade(78.8);
        printGrade(42);
    }
    public static void printGrade(double score){
        if(score >=90){
            System.out.println("A");
        }
         else if (score >=80){
            System.out.println("B");
        }
         else if (score >=70){
            System.out.println("C");
         }
         else if (score >=60){
            System.out.println("D");
        }
        else
            System.out.println("不及格");
        }

    }

