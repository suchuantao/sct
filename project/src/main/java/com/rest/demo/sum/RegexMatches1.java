package com.rest.demo.sum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches1 {
    private static final String rigin="\\bcat\\b";
    private static final String input="cat cat cat cattie cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(rigin);//提取字符串中指定的字符
        Matcher m = p.matcher(input);//获取mathcer对象
        int cont = 0;
        while (m.find()){
            cont++;
            System.out.println(cont);
            System.out.println(m.start());//以前的匹配操作期间，由给定组所捕获的子序列的初始索引
            System.out.println(m.end());//end 方法最后一个匹配字符的索引加 1
        }
    }
}
