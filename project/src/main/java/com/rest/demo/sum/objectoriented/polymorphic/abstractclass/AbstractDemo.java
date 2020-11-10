package com.rest.demo.sum.objectoriented.polymorphic.abstractclass;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary salary = new Salary("李八","阿联酋",2,22.2);
        Employee employee =  new Salary("张三三","上海",23,123.3);
        salary.mailCheck();
        employee.mailCheck();
    }
}
