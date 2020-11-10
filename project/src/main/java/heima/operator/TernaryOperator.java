package heima.operator;

/*
 * 三元运算符
 *   关系表达式？表达式一：表达式二
 *   执行流程
 *       A 计算表达式的值，是true还是false
 *       B 如果是true则表达式1则是结果
 *         如果是false则表达式2就是结果
 * */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 100;
        int b = 102;
        int d=50;
        int c = (a > b) ? a : b;
        System.out.println("c:" + c);
        //比较两个数是否相等
        boolean b1 = (a == b) ? true : false;
        System.out.println("a和b是否相等"+b1);

        //比较a.b,d三个数的最大值
          //先获取两个数的最大值在跟第三个数据做比较
         int e= (a>b)?a:b;
         int max=  (e>d)?e:d;
        System.out.println("最大值为："+max);
    }
}
