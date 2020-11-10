package heima.heima18.setandmap.set.hashset;

import com.google.common.base.Objects;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/19 11:19
 */
public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                  ", age=" + age +
                '}';
    }
//重写equals方法：如果hash值一样，则需要进equals方法进行比较

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equal(name, student.name);
    }
//重写hashCode方法，然后相同元素需要去重
    @Override
    public int hashCode() {
        return Objects.hashCode(name, age);
    }
}
