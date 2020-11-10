package heima.api.object.tostring;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/13 15:23
 */
public class ObjictDemo1 {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="王武";
        student.age=18;
        String s= student.toString();
        System.out.println(s);

    }
}
