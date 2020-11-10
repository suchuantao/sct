package yunnex.junit;

import java.util.Random;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package ${package_name}
 * @Description ${todo}
 * @date 2020/10/28 15:00
 */
public  class RandomNumber {
    /**
     * 获取1~100之间的随机数
     */
    public static int randomMoney(){
        int min=1;
        int max=100;
        Random random = new Random();
        int randomMoney = random.nextInt(max)%(max-min+1) + min;
        System.out.println("获取随机金额："+randomMoney);
        return randomMoney;
    }

    /**
     * 获取1~10之间的随机数
     */
    public static int randomIntegral(){
        int min=1;
        int max=10;
        Random random = new Random();
        int randomIntegral = random.nextInt(max)%(max-min+1) + min;
        System.out.println("获取随机积分："+randomIntegral);
        return randomIntegral;
    }



}
