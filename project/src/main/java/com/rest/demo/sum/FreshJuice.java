package com.rest.demo.sum;

 public class FreshJuice {
    enum FreshJuiceSize{SMALL, MEDIUM , LARGE}
    FreshJuiceSize size;


     public static void main (String[] args){
         FreshJuice juice =new FreshJuice();
         juice.size= FreshJuiceSize.LARGE;
         juice.size= FreshJuiceSize.MEDIUM;
         juice.size= FreshJuiceSize.SMALL;

     }
}


