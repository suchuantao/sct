package com.rest.demo.sum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        String line="select * from customer 000000! ";
        String p ="(\\D*)(\\d+)(.*)";
        //创建Pattern对象
        Pattern pattern = Pattern.compile(p);
        //创建matcher对象
        Matcher m=pattern.matcher(line);
        if(m.find()){
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));


        }else {
            System.out.println("No!");

        }
    }
}
