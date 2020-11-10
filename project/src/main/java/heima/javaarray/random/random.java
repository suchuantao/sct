package heima.javaarray.random;

import java.util.Random;

/*
* 创建一个随机数
* */
public class random {
    public static void main(String[] args) {
        //创建对象
        Random random =new Random();
        //获取随机数 随机数的范围[0,10)包含0，不包含10
        int number=random.nextInt(10);
        System.out.println("获取的随机数为："+number);


        //用for循环来获取10个随机数
        for (int i = 0; i < 10; i++) {
            int number2=random.nextInt(10);
            System.out.println("for循环获取随机数为："+number2);

        }

        //获取1~100之间的随机数
        int number3=random.nextInt(100)+1;
        System.out.println(number3);
    }
}
