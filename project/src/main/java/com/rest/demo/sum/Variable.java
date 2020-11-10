package com.rest.demo.sum;

public class Variable {
    static int allClicks=0;//类变量
    String str ="Hello word";//实例变量
    public void pupAge(){
        int age=4;//局部变量
        age = age + 7;
        System.out.println("小狗的年龄为："+age);
    }

    public static void main(String[] args) {
        Variable test1 =new Variable();
        test1.pupAge();
    }


}
