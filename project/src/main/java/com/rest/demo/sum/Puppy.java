package com.rest.demo.sum;

public class Puppy {
    public Puppy(String name,Integer age){
        System.out.println("小狗的名字:"+name);
        System.out.println("小狗的年龄:"+age);

    }

    public static void main(String[] args) {

        Puppy puppy =new Puppy("Tommy",19);
    }
}
