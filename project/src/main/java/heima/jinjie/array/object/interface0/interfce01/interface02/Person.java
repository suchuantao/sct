package heima.jinjie.array.object.interface0.interfce01.interface02;

/**
 * @author suchuantao
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2020/10/9 16:36
 */

/**
 * 人
 */
public class Person {
    String name;//姓名
    int age;//年龄
    String gender;//性别

    /**
     * 无参构造
     */

    public Person() {
    }

    /**
     * 有参构造
     */

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 吃
     */
    public void eat(){
        System.out.println("吃");
    }

    /**
     * 睡觉
     */
    public void sleep(){
        System.out.println("打豆豆");
    }
}
