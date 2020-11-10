package heima.api.object.equals;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/13 16:21
 */
public class Test {
    public static void main(String[] args) {
        Person person=new Person("战三",18);
        Person person1=new Person("战三",18);
        boolean o= person.equals(person1);
        System.out.println(o);

    }
}
