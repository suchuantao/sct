package heima.object.student.student;

public class Student {

    //成员变量
    public String name;
    public int age;

    //无参构造方法
    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }

    //get,set 方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 && age > 150) {
            System.out.println("你输入的年龄有误");
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员方法
    public void study(String name) {
        System.out.println(name + "爱学习");
    }

    public void eat() {
        System.out.println("吃饭");
    }

}
