package com.rest.demo.sum.objectoriented.polymorphic.abstractclass;

public class Salary extends Employee {
    private double salary;
    public Salary(String name,String address, int number,double salary){
        super(name, address, number);
        setSalary(salary);

    }
    public void mailCheck(){
        System.out.println(getName()+getSalary());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0.0){
            this.salary = salary;
        }

    }
    public double computPay(){
        return salary/52;
    }
}
