package heima.object.student.test;

import heima.object.student.student.Student;

public class StudentTest {
    public static void main(String[] args) {
        //方式一
        Student student= new Student();
       student.setName("张三");
       student.setAge(28);
        student.eat();
        student.study("李四");
        System.out.println(student.name);
        System.out.println(student.age);

        //通过get方法获取数据
        System.out.println("-----------");
        System.out.println(student.getName()+"今年"+student.getAge()+"岁");

        //构造方法调用
        Student student2=new Student("王麻子",26);
        student2.eat();

        System.out.println("----------------------");
        //方式二
           //定义一个数组
        Student [] students=new Student[3];
        //使用带参构造方法赋值
        Student student1=new Student("曹操",65);
        Student student3=new Student("刘备",55);
        Student student4=new Student("孙权",48);
//把学生对象作为元素赋值给学生数组
        students[0]=student1;
        students[1]=student3;
        students[2]=student4;

        //遍历数组
        for (int i = 0; i < students.length; i++) {
         Student s5=students[i];
            System.out.println(s5.getName());
            System.out.println(s5.getAge());

        }

    }
}
