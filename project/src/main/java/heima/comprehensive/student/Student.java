package heima.comprehensive.student;

public class Student {
    private String id;
    private String name;
    private String age;
    private String ardess;

    public Student() {
    }

    public Student(String id, String name, String age, String ardess) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ardess = ardess;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getArdess() {
        return ardess;
    }

    public void setArdess(String ardess) {
        this.ardess = ardess;
    }
}
