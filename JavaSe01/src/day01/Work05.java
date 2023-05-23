package day01;

import java.util.Scanner;

public class Work05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请以mm hh ss的格式输入时间，然后将返回前一秒时间");
//        String str=scanner.nextLine();
//        String [] s= str.split("\\ ");
//        for (int i = 0; i <s.length ; i++) {
//            System.out.println(s[i]);
//        }
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (c>=0&&c<=60&&b>=0&&b<=60&&a>=0&&a<=24) {
            if (c==0) {
                c=59;
                b-=1;
            }else {
                c-=1;
            }
            if (b ==0||b==-1) {
                b=59;
                a-=1;
            }
            if (a == 0||a==-1) {
                a=23;
            }

        }
        System.out.println("上一秒的时间是"+a+":"+b+":"+c);

    }
}
