package com.rest.demo.sum;
//一个类可以拥有多个方法，在上面的例子中：barking()、hungry() 和 sleeping() 都是 Dog 类的方法
public class Dog {
    private String name = "a";
    private int age = 18;
    private String color = "黑色";
    void hungry(){

    }
    void sleeping(){

    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.color);


    }
}
