package heima.bianliang;
/*
* 变量定义的注意事项
*   A 变量未赋值，不能直接使用
*   B 变量只在它所属的范围内有效
*       变量属于它所在的括号内
*   C 一行上可以定义多个变量，但不建议
* */
public class Variable {
    public static void main(String[] args) {
    //定义变量a
        int a =10;
        System.out.println(a);

        int b;
        b=23;
        System.out.println(b);

        {
            //代码块
            int c=30;
            System.out.println(c);
        }
        //会报错，超过了变量作用域
      //  System.out.println(c);

        //不建议这样书写
        int d , f;
        d=40;
        f=55;
        System.out.println(d);
        System.out.println(f);

    }
}
