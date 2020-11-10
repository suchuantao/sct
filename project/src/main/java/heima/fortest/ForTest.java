package heima.fortest;

public class ForTest {
    public static void main(String[] args) {
        //输出10次HelloWord
        for (int i = 1; i <=10 ; i++) {
            System.out.println("HelloWord");
        }

        //获取1~5的数据
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("-------------------");

        //获取5~1的数据
        for (int i = 5; i >=1 ; i--) {
            System.out.println(i);
        }

        System.out.println("----------------");
        //求和1到5的数据之和
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
           // sum=sum+i;
            sum+=i;


        }
        System.out.println("sum:"+sum);

        System.out.println("-------------------");


        //求和1~100偶数和
        int sum2=0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                sum2+=i;
            }

        }
        System.out.println("1~100之间的偶数和为:"+sum2);
    }
}
