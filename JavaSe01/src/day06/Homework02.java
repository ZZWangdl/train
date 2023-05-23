package day06;

import java.util.Scanner;

public class Homework02 {
    //2)求任意两个数范围之内的奇数和
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数n的值");
        int max = scanner.nextInt();
        int min = scanner.nextInt();
        int a = 0;
        int sum = 0;
        if (min > max) {
            a = min;
            min = max;
            max = a;
        }
        for (int i = min+1; i < max; i++) {
            if (i % 2 != 0) {
                sum+=i;
            }

        }
        System.out.println("所有范围内的奇数和是"+sum);
    }
}
