package day04;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        //4、编写一个程序，让用户输入一个正整数值，然后计算该数各位数的和(使用循环完成)
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int sum=0;
        while (a/10!=0 ) {
            sum+=a%10;
            a=a/10;
        }

        System.out.println("所有各位数的和为:"+(sum+a));
    }
}
