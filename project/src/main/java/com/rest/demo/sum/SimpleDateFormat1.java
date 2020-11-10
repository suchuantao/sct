package com.rest.demo.sum;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat1 {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String input =args.length==0? "1818-11-11" : args[0];
        System.out.println(input+"Parses as");
        Date t;
        try {
            t=sf.parse(input);
            System.out.println(t);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unparseable using"+sf);
        }

    }

}
