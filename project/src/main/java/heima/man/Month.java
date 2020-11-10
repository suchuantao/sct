package heima.man;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        getMonth();
        getMonthWhich();
    }
    public static void getMonth(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入月份(1~12):");
        int month= scanner.nextInt();
        if((month==12)||(month==1)||(month==2)){
            System.out.println("冬季");
        }else if ((month==3)||(month==4)||(month==5)){
            System.out.println("春季");
        }else if((month==6)||(month==7)||(month==8)){
            System.out.println("夏季");
        }else if((month==9)||(month==10)||(month==11)){
            System.out.println("秋季");
        }else {
            System.out.println("你输入的月份不合法:");
        }
    }
    public static void getMonthWhich(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入月份(1~12):");
        int month= scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
                default:
                    System.out.println("你输入的月份不合法！");

        }
    }

}
