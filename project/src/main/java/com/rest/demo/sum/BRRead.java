package com.rest.demo.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
    public static void main(String[] args)  throws IOException {
        char c;
        //使用system.in创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按q退出");
        //读取字符
        do {
            c = (char) br.read();
            System.out.print(c);
        }while ( c !='q');

    }
}
