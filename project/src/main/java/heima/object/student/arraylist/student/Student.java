package heima.object.student.arraylist.student;

public class Student {
    public String name;//姓名
    public int age;//年龄
    public String classes;//班级
   //无参构造方法
    public Student() {
    }
   //有参构造方法
    public Student(String name, int age, String classes) {
        this.name = name;
        this.age = age;
        this.classes = classes;
    }
     //get set方法
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

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
