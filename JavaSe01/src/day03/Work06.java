package day03;

import java.util.Scanner;

public class Work06 {
    //   6)从键盘上输入一个数,逆序输出
    public static void main(String[] args) {
//            long a=1234;
//            int b=(int)a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个正整数,然后就会逆序输出");
        int a=scanner.nextInt();
        if (a<=0) {
            System.out.println("不是正整数");
            return;
        }
        while (a/10!=0 ) {
            System.out.print(a%10);
            a=a/10;
        }
        System.out.print(a);
    }
}
