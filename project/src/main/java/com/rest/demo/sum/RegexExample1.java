package com.rest.demo.sum;

import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        String a ="select * from custmer";
        String v =".*select *";
        //Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher
        // 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象
        boolean b = Pattern.matches(a,v);

        System.out.println(b);
    }
}
