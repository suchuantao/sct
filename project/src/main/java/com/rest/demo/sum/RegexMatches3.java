package com.rest.demo.sum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches3 {
    private static String REGEX = "dog";//被替换参数
    private static String INPUT = "The dog says meow. "+"All dogs say meow.";
    private static String REPLACE ="cat";//替换参数

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);//Pattern类用于创建一个正则表达式,在使用Pattern.compile函数时，可以加入控制正则表达式的匹配行为的参数
        Matcher m = p.matcher(INPUT);//matches()用于全字符串匹配
        INPUT = m.replaceAll(REPLACE);//replaceAll 替换所有匹配
        System.out.println(INPUT);
    }
}
