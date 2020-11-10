package com.rest.demo.sum.objectoriented.polymorphic.polymorphic;

import com.rest.demo.sum.objectoriented.polymorphic.polymorphic.Animal;
import com.rest.demo.sum.objectoriented.polymorphic.polymorphic.Cat;
import com.rest.demo.sum.objectoriented.polymorphic.polymorphic.Dog;

public class Test {
    public static void show(Animal animal) {
        animal.eat();
        if (animal instanceof Cat) {//猫做的事情
            Cat cat = (Cat) animal;
            cat.work();

        } else if (animal instanceof Dog) {//狗做的事情
            Dog dog = (Dog) animal;
            dog.work();

        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        show(cat);// 以 Cat 对象调用 show 方法
        Dog dog = new Dog();
        show(dog);// 以 Dog 对象调用 show 方法

        Animal animal = new Cat();//向上转型
        animal.eat();//调用Cat的eat()
        Cat cat1 = (Cat) animal;//向下转型
        cat1.work();//调用的是Cat的work
    }
}
