package heima.breakandcontinue;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            if(i%3==0){
                continue;
            }
            if (i==8){
                break;
            }
            System.out.println(i);
        }
    }
}
