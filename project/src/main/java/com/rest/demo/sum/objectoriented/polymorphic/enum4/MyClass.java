package com.rest.demo.sum.objectoriented.polymorphic.enum4;


//在 switch 中使用枚举类
public class MyClass {
    public static void main(String[] args) {
        Color color = Color.BLUE;
        switch (color){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }
    }


}
