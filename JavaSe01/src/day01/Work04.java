package day01;

import java.util.Scanner;

public class Work04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符");
        String l=scanner.next();
        char c=l.charAt(0);
        byte b=(byte)c;
        if (b>=48&&b<=59) {
            System.out.println("该字符是一个数字");
        }else if (b>=65&&b<=90) {
            System.out.println("该字符是一个大写字母");
        }else if (b>=97&&b<=122) {
            System.out.println("该字符是一个小写字母");
        }


    }
}
