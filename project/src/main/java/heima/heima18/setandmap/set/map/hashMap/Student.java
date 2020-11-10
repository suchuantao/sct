package heima.heima18.setandmap.set.map.hashMap;

import com.google.common.base.Objects;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/20 17:32
 */
public class Student {
    String name;
    String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equal(name, student.name) &&
                Objects.equal(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
    }
}
