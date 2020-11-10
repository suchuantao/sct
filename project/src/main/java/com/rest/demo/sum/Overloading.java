package com.rest.demo.sum;

//重载

public class Overloading {
    public int test() {
        System.out.print("王刚今年：");
        return 18;
    }

    public String test(String a) {
        //System.out.println("test2传递一个参数");

        return a;
    }

    public String test(int a, String name) {
        System.out.println("test3传递两个参数，");
        return name;

    }

    public String test(String name, int a) {
        System.out.println("test4哈哈哈哈哈哈哈哈哈");
        return name;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.test());
        System.out.println(overloading.test("dd"));
        System.out.println(overloading.test(3, "张三"));
        System.out.println(overloading.test("王武", 44));
    }
}
