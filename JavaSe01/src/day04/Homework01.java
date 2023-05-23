package day04;

import java.util.Scanner;

public class Homework01 {
    /*
1.根据输入数字显示对应的英文星期名称缩写，输入不合法数字时程序结束。
*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int week=scanner.nextInt();
       switch (week){
           case 1:
               System.out.println("Mon");
               break;
           case 2:
               System.out.println("Tue");
               break;
           case 3:
               System.out.println("Wed");
               break;
           case 4:
               System.out.println("Thu");
               break;
           case 5:
               System.out.println("Fri");
               break;
           case 6:
               System.out.println("Sat");
               break;
           case 7:
               System.out.println("Sun");
               break;
           default:
               System.out.println("输入不合法");


       }

    }
}
