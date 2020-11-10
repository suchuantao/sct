package com.rest.demo.sum;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    /*Employee类的构造器*/
    public Employee(String name){
        this.name=name;
    }
//    //设置age的值
//    public void setAge(int Empage){
//        age=Empage;
//    }
//    /*设置designation的值*/
//    public void Designation(String DesignaTion ){
//        designation=DesignaTion;
//    }
//    /*设置salary的值*/
//    public void Salary(double salary1){
//        salary=salary1;
//    }
//    /*打印信息*/
//    public void printEmployee(){
//        System.out.println("名字："+name);
//        System.out.println("年龄："+age);
//        System.out.println("职位："+designation);
//        System.out.println("薪水："+salary);
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

}
