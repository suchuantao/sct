package com.rest.demo.sum.objectoriented.polymorphic.virtualfunction;

public class VirtualDemo {
    public static void main(String[] args) {
        //子类Salary对象
        Salary salary = new Salary("张三三", "深圳", 123, 12800.0);
        salary.setName("张三");
        salary.setAddress("深圳");
        salary.setNumber(2);
        salary.setSalary(20020.0);
        System.out.println("使用Salary的引用调用mailCheck ()");
        salary.mailCheck();
//父类Employee对象
        Employee employee = new Employee("李四思", "深圳", 22, 13000.0);
        employee.setName("李四");
        employee.setAddress("深圳");
        employee.setNumber(5);
        System.out.println("使用Employee的引用调用mailCheck ()");
        employee.mailCheck();
    }
}
