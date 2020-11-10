package com.rest.demo.sum;

public class Super2 extends Super1 {
    public void move(){
        super.move();//在子类调用父类的重写方法，使用super关键字
        System.out.println("狗和猫哈哈哈");
    }
}
