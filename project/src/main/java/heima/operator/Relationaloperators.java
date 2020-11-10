package heima.operator;
/*
* 关系运算符
*   ==,!=,>,>=,<,<=
* */
public class Relationaloperators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=10;
        System.out.println(a!=b);
        System.out.println(a<b);
        //注意
        System.out.println(a==b);
        System.out.println(a=b);//把b的值赋值给a,然后输出a的值
    }
}
