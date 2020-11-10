package com.rest.demo.sum;

public class For {
    public static void main(String[] args) {
        int []numbers={10,20,30,40,50};
        for (int x : numbers) {
            if(x==30){
                break;
            }
            System.out.println(x);
        }
        String [] names={"张三","李四","王武","赵莉","田七"};
        for(String y:names){
            if(y=="赵莉"){
                continue;
            }
            System.out.println(y);
        }
    }
}
