package com.rest.demo.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        //使用system.in创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do{
            str = br.readLine();//读取输入都字符串
            System.out.println(str);
        }while (!str.equals("end"));


    }
}
