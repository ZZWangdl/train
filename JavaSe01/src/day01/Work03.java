package day01;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入今天星期几和经过天数会显示几天后是星期几");
        System.out.println("请输入今天是星期几（0~7中的整数）");
        int a =scanner.nextInt();
        System.out.println("请输入经过几天");
        int b =scanner.nextInt();
        //System.out.println("今天是星期"+a+"经过"+b+"天后是星期"+(a+b+1)%7);
        int c=(a+b+1)%7;
        switch (c){
            case 1 :

                System.out.println("经过"+b+"天后是星期一");
                break;
            case 2 :
                System.out.println("经过"+b+"天后是星期二");
                break;
            case 3 :
                System.out.println("经过"+b+"是星期三");
                break;
            case 4 :
                System.out.println("经过"+b+"是星期四");
                break;
            case 5 :
                System.out.println("经过"+b+"是星期五");
                break;
            case 6 :
                System.out.println("经过"+b+"是星期六");
                break;
            case 7 :
                System.out.println("经过"+b+"是星期日");
                break;
        }
            int aa=1;
            int bb=2;
            aa=++aa + aa;
        System.out.println(aa);
    }
}
