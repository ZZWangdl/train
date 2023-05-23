package day02;

import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) {
        //            2、从键盘输入3个整数，分别赋给变量a、b、c，
//    然后将输入的整数值按照从小到大的顺序存放在变量a、b、c中，并输出三个变量的值。
        Scanner  scanner=new Scanner(System.in);
        System.out.println("请输入三个整数");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=0;
        if (a<b) {
            d=a;
            a=b;
            b=d;
        }
        if (a<c) {
            d=a;
            a=c;
            c=d;
        }
        if (b<c) {
            d = b;
            b = c;
            c = d;
        }
        System.out.println("三个整数从小到大依次为\n"+c+"<"+b+"<"+a);

    }
}
