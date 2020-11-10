package com.rest.demo.sum;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);
        //next方式接收
        System.out.println("next方式接收：");
        //判断是否还有输入
        if (scanner.hasNext()) {
            String str1 = scanner.next();
            System.out.println("输入都数据为：" + str1);

        }
        scanner.close();
    }

    public static class ScannerDemo2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("next2方式接收：");
            if (scanner.hasNextLine()) {
                String str2 = scanner.nextLine();
                System.out.println("输入数据为：" + str2);
            }
            scanner.close();
        }
    }
}
