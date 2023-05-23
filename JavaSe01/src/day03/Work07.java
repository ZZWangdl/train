package day03;

import java.util.Scanner;

public class Work07 {
    //7)编写一个程序,从键盘上输入一个十进制正整数,输出它的二进制数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int k = scanner.nextInt();
        int num = k;
        String s = "a";
        while (num / 2 != 0) {
            s += num % 2;
            num /= 2;
        }
        s = s + num;
        char[] a = s.toCharArray();
        for (int i = a.length - 1; i > 0; i--) {
            System.out.print(a[i]);
        }

    }
}
