package heima.fortest;
/*
* 水仙花：个位立方+十位立方+百位立方等于他本身
*
* */
public class Narcissus {
    public static void main(String[] args) {
        //定义变量统计水仙花个数
        int count = 0;
        //用for循环控制范围
        for (int i = 100; i <=999 ; i++) {
            //获取个位，十位，百位
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/10/10%10;
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai)==i){
                System.out.println("水仙花数："+i);
                count++;

            }

        }
        System.out.println("水仙花个数为："+count);
    }
}
