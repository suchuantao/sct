package com.rest.demo.sum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {
    private static final String REGEX ="a*b";//匹配ab,aab
    private static final String INPUT ="aabfooaabfooabfoobkkk";
    private static final String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);//在使用Pattern.compile函数时，可以加入控制正则表达式的匹配行为的参数
        Matcher m =p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()){
          /*
          * sb是一个StringBuffer，REPLACE待替换的字符串，
             这个方法会把匹配到的内容替换为REPLACE，并且把从上次替换的位置到这次替换位置之间的字符串也拿到，
             然后，加上这次替换后的结果一起追加到StringBuffer里（假如这次替换是第一次替换，那就是只追加替换后的字符串啦）
          *
          * */
            m.appendReplacement(sb,REPLACE);

        }
        //使用appendTail()用于文本替换,sb是一个StringBuffer，这个方法是把最后一次匹配到内容之后的字符串追
        // 加到StringBuffer中
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
