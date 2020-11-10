package com.rest.demo.sum;

public class Start {

    static class A {
        void axx() {
            System.out.println("早上好，我是A");
        }
    }

    static class B {
        void bxx() {
            System.out.println("中午好，我是B");
        }
    }

    static class C {
        void cxx() {
            System.out.println("晚上好，我是C");
        }
    }

    static class D {
        void dxx() {
            System.out.println("午夜嗨皮，我是dj");
        }
    }

    // instanceof 关键字是用于比较类与类是否相同，相同返回true，不同返回false
    //当你不清楚你需要的参数是什么类型的，可以用Object来代替，Object可以代替任何类
    static void spack(Object obj) {
        if (obj instanceof A) {//如果参数是 A 类，那么就执行一下语句
            A aobj = (A) obj;//强制转换
            aobj.axx();
        } else if (obj instanceof B) {
            B bobj = (B) obj;
            bobj.bxx();

        } else if (obj instanceof C) {
            C cobj = (C) obj;
            cobj.cxx();

        }

    }

    public static void main(String[] args) {
        A a = new A();
        spack(a);
        B b = new B();
        spack(b);
        C c = new C();
        spack(c);
        D d = new D();
        spack(d);
    }
}
