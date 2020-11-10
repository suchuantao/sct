package com.rest.demo.sum;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数据：");
        StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());
        System.out.println("分割后");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());

        }
    }
}
