package heima.man;
/*
 * 		要求：求和的元素的个位和十位不能包含7,并且只能为偶数。
 *
 *     分析：
 * 		A:定义一个int类型的一维数组
 * 		B:定义一个求和变量
 * 		C:遍历数组，获取到数组中的每一个元素
 * 		D:判断该元素是否满足如下要求，如果是就累加，否则，不搭理它
 * 			x%2==0
 * 			x%10 != 7
 * 			x/10%10 !=7
 * 		E:输出结果
 */

public class ArraySunIfTest {
    public static void main(String[] args) {
        ArraySunIfTest();
    }

    public static void ArraySunIfTest() {
        //定义一个数组
        int[] arrysum = {171, 72, 19, 16, 118, 51, 210, 7, 18};
        //定义一个求和变量
        int sum = 0;
        for (int i = 0; i < arrysum.length; i++) {

            if (i % 10 != 7 && i / 10 % 10 != 7 && i % 2 == 0) {

                sum += arrysum[i];
            }

        }
        System.out.println(sum);

    }
}
