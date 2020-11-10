package com.rest.demo.sum;

public class Dog2 extends Animal{
    void eat(){
        System.out.println("dog : eat----子类");
    }
    void test(){
        this.eat();//调用自己的方法
        super.eat();//调用父类的方法
    }
    public static class Test{
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.eat();
            Dog2 dog2 = new Dog2();
            dog2.test();

        }
    }
}
