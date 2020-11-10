package com.rest.demo.sum;

import java.io.File;

public class DeleteFileDemo {
    public static void delectFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {//判断files文件不为空
            for (File f : files) {
                if (f.isDirectory()) {//创建一个 File 对象并且它是一个目录，那么调用 isDirectory() 方法会返回 true
                    f.delete();
                }
            }

        }
        file.delete();
    }

    public static void main(String[] args) {
        File file = new File("D:/project/input/input");
        delectFile(file);
    }
}
