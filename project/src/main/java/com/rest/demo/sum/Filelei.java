package com.rest.demo.sum;

import java.io.File;
import java.io.FilenameFilter;

public class Filelei implements FilenameFilter {
    public void f() {
        File f = new File("D:/project");
        String[] filename = f.list();//以字符串的形式，先列出当前目录下所有文件看一下（有什么类型的文件）
        for (int i = 0; i < filename.length; i++) {
            System.out.println(filename[i]);

        }
        System.out.println("******************************");
        String[] fname = f.list(this);
        for (int i = 0; i < fname.length; i++) {
            System.out.println(fname[i]);

        }
    }

    //重写接口方法
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");///返回当前目录下以.txt结尾的文件
    }

    public static void main(String[] args) {

        Filelei filelei = new Filelei();
        filelei.f();

    }
}
