package heima.api.object.equals;

import com.google.common.base.Objects;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/13 16:21
 */
public class Person {
    String name;
    int age;

    /**
     * 构造方法
     *
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //提供效率
        if (this == o) return true;
        //提高程序的健壮性
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Person person = (Person) o;
        return age == person.age &&
                Objects.equal(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hashCode(name, age);
    }
}
