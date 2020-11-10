package com.rest.demo.sum.objectoriented.polymorphic.polymorphic;

import com.rest.demo.sum.objectoriented.polymorphic.polymorphic.Animal;

public class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat 吃骨头");
    }

    public void work() {
        System.out.println("Dog work 看家");
    }
}
