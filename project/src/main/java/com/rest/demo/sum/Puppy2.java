package com.rest.demo.sum;

public class Puppy2 {
    private int Age;

    public void setAge(int age) {
        Age = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为："+Age);
        return Age;
    }

    public Puppy2(String name){
        System.out.println("小狗的名字："+name);
    }

    public static void main(String[] args) {
        /*创建一个对象*/
        Puppy2 puppy2=new Puppy2("Tommy");
        /*通过set方法来设置age的值*/
        puppy2.setAge(18);
        /*通过get方法来获取age的值*/
        puppy2.getAge();
        /*访问成员变量*/
        System.out.println("打印变量值"+puppy2.Age);
    }
}
