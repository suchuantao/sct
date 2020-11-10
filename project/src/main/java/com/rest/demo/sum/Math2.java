package com.rest.demo.sum;

import java.util.ArrayList;
import java.util.List;

public class Math2 {
    public static void main(String[] args) {
        String array[]={"First", "Second", "Third","赵四"};
        String a ="HelloWorl";
        List<String> list =new ArrayList<String>();
        list.add(a);
        System.out.println("数组array长度为："+array.length);
        System.out.println("字符串a的长度为："+a.length());
        System.out.println("list中元素个数为："+list.size());
        System.out.println(((ArrayList<String>) list).clone());
        System.out.println(list.isEmpty());
    }
}
