package com.rest.demo.sum.objectoriented.polymorphic.virtualfunction;
//子类
public class Salary extends Employee {
    private double salary;//全年工资
//子类构造函数
    public Salary(String name, String address, int number, double salary1) {

        super(name, address, number, salary1);
    }
//    public Salary() {
//        super();
//        //super("a", "bb",123,13.0);
//        //setSalary(salary);
//
//    }

    public void mailCheck() {
        System.out.println("Salary 类的 mailCheck 方法");
        System.out.println("邮寄支票给：" + getName() + "工资为：" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        }

    }

    public double computePay() {
        System.out.println("计算工资，付给" + getName());
        return salary / 52;
    }
}
