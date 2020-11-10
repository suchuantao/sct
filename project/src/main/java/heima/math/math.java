package heima.math;

import java.text.DecimalFormat;

/*
* Math类：包含了基本的数学基本运算
* */
public class math {
    public static void main(String[] args) {
        //返回圆周率
       double a= Math.PI;
        System.out.println("圆周率："+a);

        //返回绝对值
        int b= Math.abs(15);
        int c= Math.abs(-15);
        System.out.println("15的绝对值："+b);
        System.out.println("-15的绝对值："+c);

        //向上取整
        double d=Math.ceil(1.2);
        double e=Math.ceil(1.6);
        System.out.println("向上取整"+d);
        System.out.println("向上取整"+e);

        //向下取整
       double f= Math.floor(1.2);
       double g=Math.floor(1.9);
        System.out.println("向下取整"+f);
        System.out.println("向下取整"+g);

        //四舍五入方法
        double h= Math.round(1.2);
        double i= Math.round(1.6);
        System.out.println("四舍五入后："+h);
        System.out.println("四舍五入后："+i);

        //返回两个数最小值
        int j= Math.min(12,4);
        System.out.println("返回两个数最小值为："+j);

        //返回两个数最大值
        int k= Math.max(23,2);
        System.out.println("返回两个数最大值为："+k);

        //返回第一个参数第二个参数次幂
       double r=  Math.pow(3,4);
        System.out.println("返回第一个参数第二个参数次幂"+r);

        //返回一个随机数（0~1之前的double类型随机数）
        double rondom=  Math.random();
        System.out.println(rondom);
    }
}
