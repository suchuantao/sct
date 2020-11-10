package com.rest.demo.sum;

public class Overridetest {
    public static void main(String[] args) {
        Override1 o1 = new Override1();//父类对象
        o1.move();//执行父类的move();
        Override1 o2 = new Override2();//调用父类与子类共同的方法
        Override2 o3 = new Override2();//只能调用子类的方法
        o2.move();
        o3.move();
    }
}
