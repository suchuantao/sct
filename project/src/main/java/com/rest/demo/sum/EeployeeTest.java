package com.rest.demo.sum;

public class EeployeeTest {
    public static void main(String[] args) {
        Employee one = new Employee("张三");
        Employee two = new Employee("李四");
        Employee tree = new Employee("王武");
        one.setAge(18);
        one.setDesignation("经理");
        one.setSalary(18000);
        System.out.println(one);

        two.setAge(20);
        two.setDesignation("副总监");
        two.setSalary(20000);
        System.out.println(two);

        tree.setAge(26);
        tree.setDesignation("COO");
        tree.setSalary(23000);
        System.out.println(tree);
    }

}
