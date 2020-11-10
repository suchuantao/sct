package com.rest.demo.sum;
//定义一个外部类
public class Out {
    private int age =18;
//定义一个内部类
     class In{
         public void pritnt(){
             System.out.println(age);
         }

     }

        public static void main(String[] args) {
            Out.In in =new Out().new In();
            in.pritnt();
        }
}



