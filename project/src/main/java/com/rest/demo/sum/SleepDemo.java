package com.rest.demo.sum;

import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) {

        try {
            Date date = new Date();
            System.out.println(date);
            Thread.sleep(3000);
            Date date2 = new Date();
            System.out.println(date2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
