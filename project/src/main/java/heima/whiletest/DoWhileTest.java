package heima.whiletest;

public class DoWhileTest {
    public static void main(String[] args) {
        //用do while求水仙花个数
        int count2 = 0;
        int d = 100;
        do {
            int ge = d % 10;
            int shi = d / 10 % 10;
            int bai = d / 10 / 10 % 10;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == d) {
                System.out.println(d);
                count2++;
            }
            d++;
        } while (d <= 999);

        System.out.println("统计水仙花的个数为：" + count2);


        System.out.println("-----------------");
        //用do while求和1~100之和
        int x=1;
        int sum=0;
        do{
            sum+=x;
            x++;
        }while (x<=100);
        System.out.println("统计1~100数据之和："+sum);
    }
}
