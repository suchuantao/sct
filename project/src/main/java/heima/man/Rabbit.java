

/*
*需求：
* 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 		假如兔子都不死，问第二十个月的兔子对数为多少？
 * 	规律：
 * 		第一个月：1
 * 		第二个月：1
 * 		第三个月：2
 * 		第四个月：3
 * 		第五个月：5
 * 		...
 * 	分析：
 * 		int[] arr = new int[20];
 *
 * 		arr[0] = 1;
 * 		arr[1] = 1;
 *
 * 		arr[2] = arr[0] + arr[1];
 * 		arr[3] = arr[1] + arr[2];
 * 		arr[4] = arr[2] + arr[3];
 * 		...
 * */
public class Rabbit {
    public static void main(String[] args) {
        rabbit();
    }
    public static void rabbit(){
        //定义一个数组：
        int rabbit[]=new int[20];
        //给数组赋值，也就是第一个月，第二个月兔子的数量
        rabbit[0]=1;
        rabbit[1]=1;
        for (int i = 2; i < rabbit.length; i++) {
            rabbit[i]=rabbit[i-1]+rabbit[i-2];
        }
        System.out.println("第二十个月兔子的数量为:"+rabbit[19]);

    }
}
