package com.rest.demo.sum.objectoriented.polymorphic.polymorphic;

import com.rest.demo.sum.objectoriented.polymorphic.polymorphic.Animal;

public class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eat 吃鱼");
    }

    public void work() {
        System.out.println("Cat work 抓老鼠");
    }
}
