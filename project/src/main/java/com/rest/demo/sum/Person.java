package com.rest.demo.sum;

public class Person {
    public static void prt(String s){
        System.out.println(s);
    }
    Person(){
        prt("1父类·无参数构造方法： "+"A Person.");
    }//构造方法1
    Person (String name){
        prt("2父类·含一个参数的构造方法： "+"A person's name is " + name);
    }//构造方法2
}

 class Chese extends Person {
     Chese() {
         super();//调用父类具有相同参数的构造方法
         prt("3子类·调用父类”无参数构造方法“： " + "A chinese coder.");
     }

     Chese(String name) {
         super(name);//调用父类具有相同参数的构造方法2
         prt("4子类·调用父类”含一个参数的构造方法“： " + "his name is " + name);
     }

     Chese(String name, Integer age) {
         this(name);//调用父类具有相同参数的构造方法
         prt("5子类：调用子类具有相同形参的构造方法：his age is " + age);

     }

     public static void main(String[] args) {
       //  Chese chese1=new Chese();
      //   Chese chese2= new Chese("张三");
         Chese chese3 = new Chese("李四",30);
     }
 }