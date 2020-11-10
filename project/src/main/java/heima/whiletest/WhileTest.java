package heima.whiletest;
/*
* while循环
* */
public class WhileTest {
    public static void main(String[] args) {
        //先用for循环打印十次HelloWord
        for (int i = 1; i <=10 ; i++) {
            System.out.println("HelloWord");
        }


        System.out.println("用while循环打印十次HelloWorld");
        //用while循环打印十次Hellow
        System.out.println("用while循环打印十次Hellow");
        int i=1;
        while (i<=10){
            System.out.println("HelloWorld");
            i++;
        }


        System.out.println("-------------------------------------");
        //求和1~100之和
        int sum=0;
        int x=1;
        while (x<=100){
            sum+=x;
            x++;

        }
        System.out.println("1~100数据之和:"+sum);


        System.out.println("------------------------");


        //用do while 打印10次HelloWord
        System.out.println("用do while 打印10次HelloWord");
            int i2=1;
        do {
            System.out.println("HelloWorld");
            i2++;
        }while (i2<=10);


        //用do  while求和1~100之和
        System.out.println("用do  while求和1~100之和");

        int sum1=0;//求和
        int y=1;
        do {
            sum1+=y;
            y++;
        }while (y<=100);
        System.out.println(sum1);





    }
}
