package heima.api.object.date;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/14 10:36
 */

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 *  格式化
 *      Date     ---  String
 *      2020-10-14---- 2020年10月14日
 *      String format(Date date)
 *   解析
 *      String ---    Date
 *  2020年10月14日
 *  Date parse(String source)
 *
 *  构造方法：
 *  SimpleDateFormat() 使用默认的模式对对象进行构造
 *  SimpleDateFormat(String pattern) 用给定的模式和默认语言环境的日期格式符号构造
 *  SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols)  用给定的模式和日期符号构造 SimpleDateFormat
 *  SimpleDateFormat(String pattern, Locale locale)用给定的模式和给定语言环境的默认日期格式符号构造 SimpleDateFormat
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        method1();
        method2();
        method3();


    }


    public static void method3() throws ParseException {
        /**
         * 用给定的模式和日期符号构造
         * SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols)
         */
        DateFormatSymbols dateFormatSymbols=new DateFormatSymbols();
        SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z",dateFormatSymbols);
        Date date3=new Date();
        String s3=simpleDateFormat3.format(date3);
        System.out.println(s3);
        Date strdate3=simpleDateFormat3.parse(s3);
        System.out.println(strdate3.toLocaleString());
    }

    public static void method2() throws ParseException {
        /**
         * 用给定的模式和默认语言环境的日期格式符号构造
         * SimpleDateFormat(String pattern)
         */
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date date2=new Date();
       String s2=  simpleDateFormat1.format(date2);
        System.out.println(s2);
        //解析
        Date strdate2=simpleDateFormat1.parse(s2);
        System.out.println(strdate2.toLocaleString());

    }

    public static void method1() throws ParseException {
        //使用默认的模式对象进行构造
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        //创建当前日期对象
        Date date=new Date();
        //把日期对象转换成字符串
        String strdata= simpleDateFormat.format(date);
        System.out.println(strdata);//20-10-14 上午11:16

        //把字符串转换成日期对象
        Date date1=simpleDateFormat.parse(strdata);
        System.out.println(date1);
    }
}
