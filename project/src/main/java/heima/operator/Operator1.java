package heima.operator;
/*
* 运算符：用于对常量和变量操作的符号
* 表达式：用运算符连接起来的符合java语法表达式，不同的运算符连接的表达式就是不同的表达式
*   举例：a,b   a+b
* 运算符分类
*   算术运算符
*       加法运算
*           字符参与运算，其实是拿字符在计算机中存储的数值来参与运算
*           字符串参与运算 其实做的不是加法，是字符串拼接
*      ++,--
*      ++在后，先运算在自+
*      ++在前  先自+在运算
*   赋值运算符
*   关系运算符
*   逻辑运算符
*   三元运算符
*
* */
public class Operator1 {
    public static void main(String[] args) {
        int a=3;
        int b=7;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//整数相除只能得到整数，如果要得到小数，就必须有浮点数参与运算

        System.out.println(b/a);//整除求商
        System.out.println(b%a);//求余
        char c ='A';
        //字符参与运算
        System.out.println(a+c);
        //字符串参与运算
        System.out.println("hellow"+a);
        System.out.println("hellow"+a+b);//hellow37
        System.out.println(a+b+"hellow");//30hellow
        int d=a;
        int f= d++;
        int e=++d;
        System.out.println("f:"+f);
        System.out.println("e:"+e);
    }
}
