package com.rest.demo.sum;

public class Employee2 {
    //实例变量对子类可见
    public String name;
    //私有变量，仅在该类使用
    private double salary;
    //在构造器中对name赋值
    public Employee2 (String Empname2){
        name = Empname2;
    }
    public void setSalary2(double Empsalry2){
        salary = Empsalry2;
    }
    //打印方法
    public void printEmp(){
        System.out.println("名字："+name);
        System.out.println("薪水："+salary);
    }

    public static void main(String[] args) {
        Employee2 epm2 = new Employee2("张三");
        epm2.setSalary2(10000.0);
        epm2.printEmp();
    }
}
