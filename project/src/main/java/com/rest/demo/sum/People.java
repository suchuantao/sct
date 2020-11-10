package com.rest.demo.sum;

//一个没有显示声明构造函数的类
public class People {
    int age = 23;
    public void getAge(){
        System.out.println("this age is "+age);
    }
    //用这个类来实例化一个对象
    public static void main(String[] args) {// People() 是People类的默认构造函数，它什么也不干
        People people =new People();
        people.getAge();

    }
}
