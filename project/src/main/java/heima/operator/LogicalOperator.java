package heima.operator;

/*
* 逻辑运算符：用于连接关系表达式
* &,|,^,
* &&和&结果一样
* ||和|结果一样
*&&和&的区别：
*   &&有短路的效果，左边为false,则右边不执行
*   &左边无能是什么，右边都会执行
*||和|则同理
*
*
* &:有false则false
* |:有true则true
* ^:相同则false,不同则ture
* !:true则false,false则true
* */
public class LogicalOperator {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int c =5;
        //&
        System.out.println("----&-------------");
        System.out.println(a>c&a>c);
        System.out.println(a<c&a>c);
        System.out.println(a<c&a<c);
        System.out.println(a>c&a<c);


        //&&
        System.out.println("----&&-------------");
        System.out.println(a>c&&a>c);
        System.out.println(a<c&&a>c);
        System.out.println(a<c&&a<c);
        System.out.println(a>c&&a<c);
        System.out.println("-------------------");
        //|
        System.out.println("--------|-----------");
        System.out.println(a>c|a>c);
        System.out.println(a<c|a>c);
        System.out.println(a<c|a<c);
        System.out.println(a>c|a<c);
        //||
        System.out.println("--------||-----------");
        System.out.println(a>c||a>c);
        System.out.println(a<c||a>c);
        System.out.println(a<c||a<c);
        System.out.println(a>c||a<c);

        //^
        System.out.println("--------^-----------");
        System.out.println(a>c^a>c);
        System.out.println(a<c^a>c);
        System.out.println(a<c^a<c);
        System.out.println(a>c^a<c);


        //!
        System.out.println("-----!-------------");
        System.out.println(a>b);
        System.out.println(!(a>b));
        System.out.println(!!(a>b));

        int x=10;
        int y=20;
        int e=10;
        int f=20;
        System.out.println("-----&和&&的区别");
        System.out.println((x++>10)&(y++>20));
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println((e++>10)&&(f++>20));
        System.out.println("e:"+e);
        System.out.println("f:"+f);
    }
}
