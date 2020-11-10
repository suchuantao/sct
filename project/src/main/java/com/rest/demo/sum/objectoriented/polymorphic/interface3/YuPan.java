package com.rest.demo.sum.objectoriented.polymorphic.interface3;

public class YuPan implements USB {
    public void read() {
        System.out.println("U盘正在通过USB功能读取数据");
    }

    public void write() {
        System.out.println("U盘正在通过USB功能写入数据");

    }
}
