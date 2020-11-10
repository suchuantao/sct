package com.rest.demo.sum;

import java.io.*;

public class fileStreamTest {
    public static void main(String[] args) {
        try {
            byte bwrite[] ={11,22,33,5,44,66};
            //使用字符串类型的文件名来创建一个输入流对象来读取文件text.txt
            OutputStream os =new FileOutputStream("test.txt");
            for (int i = 0; i < bwrite.length; i++) {
                os.write(bwrite[i]);
                InputStream is = new FileInputStream("test.txt");//创建一个文件test.txt并向文件中写数据
                int size = is.available();//一次读取多个字节
                for (int j = 0; j <size ; j++) {
                    System.out.println(is.read()+" ");
                    
                }

            }

        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
