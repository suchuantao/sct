package com.rest.demo.sum;
//一个带显式构造函数的类
public class People2 {
    int age = 25;
    public void getAge(){
        System.out.println("this age is "+age);
    }
    // 显式声明一个带参数的构造函数，用于初始化年龄
    public People2(int a){
        this.age=a ;
    }
    //用这个类来实例化一个对象
    public static void main(String[] args) {
        // 使用带参数的构造函数来实例化对象
        People2 people2=new People2(20);
        // 打印出来的年龄变为20
        people2.getAge();
    }
}
