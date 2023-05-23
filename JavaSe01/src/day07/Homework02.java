package day07;

import java.util.Scanner;

public class Homework02 {
    //        2)编写一个方法，计算一个整数各位数字之和
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int m = scanner.nextInt();
        sum(m);
    }

    public static void sum(int n) {
        int sum=0;
        while (n/10!=0){
            sum+=n%10;
            n/=10;
        }
        sum+=n;
        System.out.println("各位数之和是"+sum);
    }
}
