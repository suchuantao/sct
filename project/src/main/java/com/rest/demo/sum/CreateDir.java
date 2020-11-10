package com.rest.demo.sum;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname="D:/project/input/input";
        File f = new File(dirname);
        //创建input文件夹
        f.mkdir();
        System.out.println(f);

    }
}
