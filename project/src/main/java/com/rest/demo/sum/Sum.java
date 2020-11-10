package com.rest.demo.sum;

import sun.security.provider.Sun;

public class Sum {

    public Integer sum(Integer a, Integer b){

        return a + b;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        Integer sum1 =sum.sum(12,23);
        System.out.println(sum1);
    }
}
