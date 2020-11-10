package heima.api.object.integer;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/14 16:58
 */

/**
 * Integer
 */
public class IntegerDeno {
    public static void main(String[] args) {
        //Integer10转换成int10
        Integer integer=new Integer("10");
         int a =integer.intValue();
        System.out.println(a);
        //方法二 Integer20转换成int20
       int b= Integer.parseInt("20");
        System.out.println(b);

        //把int转换成String
        Integer integer1=new Integer(50);
        String s1= integer1.toString();
        System.out.println(s1);

    }
}
