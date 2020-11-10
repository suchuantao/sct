package com.rest.demo.sum;

public class UpperLowerCase {
    public static void main(String[] args) {
        String StrA ="I am Tom.I am from China";
        String StrB ="";
        String StrC ="";
        for (int i = 0; i <StrA.length() ; i++) {
            if(Character.isUpperCase(StrA.charAt(i))){
                StrB+=StrA.charAt(i)+" ";
            if (Character.isLowerCase(StrA.charAt(i)));
                StrC+=StrA.charAt(i)+" ";

            }
            System.out.println("字符串中大写字母有："+StrB);
            System.out.println("字符串中小写字母有："+StrC);
        }

    }
}
