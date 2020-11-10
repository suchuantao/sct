package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/26 17:52
 */
public class Test {
    public static void main(String[] args) {
        //获取当前日期
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String endtime =sdf.format(today);
        System.out.println(endtime);
    }
}
