package day07;

import java.util.Scanner;

public class Homework03 {
    //        3)定义一个方法计算一个数的n次方
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要计算的整数");
        int m=scanner.nextInt();
        System.out.println("请输入要计算几次方");
        int n=scanner.nextInt();
            power(m,n);
    }

    public static void  power(int m,int n) {
        double a=1;
        for (int i = 0; i <n ; i++) {
                a*=m;

        }
        System.out.println(a);
    }
}
