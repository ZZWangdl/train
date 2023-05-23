package day06;

import java.util.Scanner;

public class Homework01 {
    //    1)求1-2+3-4+5-6...n的和
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数n的值");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            a = i;
            if (i % 2 == 0) {
                a = i * (-1);
            }
            sum += a;
        }
        System.out.println(sum);
    }
}
