package heima.object.student.arraylist.student.studentscnner;

public class Student {
    public String name;//姓名
    public String age;//年龄
    public String classes;//班级

    public Student() {
    }

    public Student(String name, String age, String classes) {
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
