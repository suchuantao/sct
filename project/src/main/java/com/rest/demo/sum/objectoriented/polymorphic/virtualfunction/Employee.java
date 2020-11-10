package com.rest.demo.sum.objectoriented.polymorphic.virtualfunction;
//父类
public class Employee {
    private String name;
    private String address;
    private  int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
//父类Employee构造函数
    public Employee(String name, String address, int number, double salary){
        this.name=name;
        this.address=address;
        this.number=number;
        System.out.println("Employee构造函数");


    }
    public void mailCheck(){
        System.out.println("邮寄支票给我："+this.name+" "+this.address);
    }
    public String toString(){
        return name+" "+address+" "+number;
    }
}
