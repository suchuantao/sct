package heima.operator;
/*
*赋值运算符
*   基本的赋值运算符：=
*   扩展赋值运算符：+=，-=，*=，/=
* */
public class AssignmentOperators {
    public static void main(String[] args) {
        int a =10;
        a+=20;//a=int(a+20),拿+=左边和右边的数值做+，然后把结果赋值给左边
        System.out.println("a:"+a);
         int b=10;
         b-=20;
        System.out.println("b:"+b);
        int c=10;
        c*=20;
        System.out.println("c:"+c);
        float d=10;
        d/=20F;
        System.out.println("d:"+d);
        //注意,扩展赋值运算符，隐含了强制类型转换
        short s=1;
        s+=1;
        System.out.println("s:"+s);
    }
}
