package heima.man;
/*
* 获取5位数的回文数并打印，例如：12321  个位与万位相同，十位与千位相同
* */
public class Hunwenshu {
    public static void main(String[] args) {
        Hunwenshu();
    }
    public static void Hunwenshu(){
        for (int i = 10000; i <100000 ; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int qian=i/10/10/10%10;
            int wan=i/10/10/10/10%10;
            if(ge==wan && shi==qian){
                System.out.println(i);
            }

        }
    }
}
