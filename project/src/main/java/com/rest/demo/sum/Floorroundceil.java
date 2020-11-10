package com.rest.demo.sum;

public class Floorroundceil {
    public static void main(String[] args) {
        double [] nums={1.4,1.5,1.6,-1.4,-1.5,-1.6};
        for (double num : nums){
            test(num);
        }
    }
    private static void test(double num){
        System.out.println(("math.floor"+ "num:"+java.lang.Math.floor(num)));//返回小于等于（<=）给定参数的最大整数
        System.out.println("math.round:"+"num"+java.lang.Math.round(num));//它表示四舍五入，算法为 Math.floor(x+0.5)，
        // 即将原来的数字加上 0.5 后再向下取整，所以，Math.round(11.5) 的结果为12，Math.round(-11.5) 的结果为-11。
        System.out.println("Math.ceil:"+"num"+ java.lang.Math.ceil(num));//返回大于等于( >= )给定参数的的最小整数，类型为双精度浮点型
    }
}
