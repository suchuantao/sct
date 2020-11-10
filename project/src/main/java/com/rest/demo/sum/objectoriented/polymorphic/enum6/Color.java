package com.rest.demo.sum.objectoriented.polymorphic.enum6;

enum Color {
    RED, GREEN, BLUE;
    //构造函数
    private Color(){
        System.out.println("Constructor called for:"+toString());
    }
    public void colorInfo(){
        System.out.println("Universal Color");
    }
}

