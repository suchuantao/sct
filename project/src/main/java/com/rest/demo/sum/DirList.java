package com.rest.demo.sum;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirnamne = "D:/project/input/input";
        File f = new File(dirnamne);
        if (f.isDirectory()) {//创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true
            System.out.println("目录：" + dirnamne);
            String s[] = f.list();//来提取它包含的文件和文件夹的列表
            for (int i = 0; i < s.length; i++) {
                File f2 = new File(dirnamne + "/" + s[i]);
                if (f2.isDirectory()) {
                    System.out.println(s[i] + "是一个目录");

                } else {
                    System.out.println(s[i] + "是一个文件");
                }


            }


        } else {
            System.out.println(dirnamne + "不是一个目录");
        }


    }
}
