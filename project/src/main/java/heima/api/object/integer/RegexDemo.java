package heima.api.object.integer;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/14 17:49
 */
public class RegexDemo {
    public static void main(String[] args) {
        String qq="1234565544";
        //校验qq 不能以0开头，长度5~15，
       boolean xx=  qq.matches("[1~9][0~9]{4,14}");
        System.out.println(xx);
    }
}
