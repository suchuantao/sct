package heima.man;

import java.util.Scanner;

/*
 * 键盘录入数据，求和，去掉最高分，最低分，求平均得分
 *
 * 分析：
 *   A：定义一个数组，长度为6
 *   B：键盘录入分数
 *   C：求评委的最高分，最低分
 *   D：分数求和
 *   E：求平均分数：(总和-最高分-最低分)/(arr.length-2)
 *   F：输出平均分
 *
 * */
public class AveScore {
    public static void main(String[] args) {
        //键盘录入
        Scanner scanner = new Scanner(System.in);
        //定义数组
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委分数:");
            int fenshu = scanner.nextInt();
            arr[i] = fenshu;
        }

        //求评委分数总和
        int sum = fenshuSum(arr);
        //求评委给出的最高分
        int max = fenshuMax(arr);
        //求评委给出的最低分
        int min = fenshuMin(arr);

        //求该选手的平均分
        int fenshuAvg = (sum - max - min) / (arr.length - 2);
        System.out.println("去掉一个最高分，去掉一个最低分，该选手最终得分为：" + fenshuAvg);

    }


    /*
     * 获取最高分
     * */
    public static int fenshuMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("评委给出的最高分为：" + max);
        return max;
    }

    /*
     * 获取最低分
     * */
    public static int fenshuMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("评委给出的最低分为：" + min);
        return min;
    }

    /*
     * 评委分数求和
     * */
    public static int fenshuSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("评委分数总和为：" + sum);
        return sum;

    }
}
