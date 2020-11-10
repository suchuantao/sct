package com.rest.demo.sum.objectoriented.polymorphic.abstractclass;
//抽象类
public abstract  class Employee {
    private String name;
    private String address;
    private int number;
    //构造方法
    public Employee (String name,String address, int number){
        this.name=name;
        this.address=address;
        this.number=number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public double computePay(){
        System.out.println("Inside Employee computePay");
     return 0.0;
    }
    public void mailCheck(){
        System.out.println("哈哈哈哈"+this.name+" "+this.address);
    }
    public String toString(){
        return name+address+number;
    }
}
