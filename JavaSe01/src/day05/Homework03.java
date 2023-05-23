package day05;

import java.util.Scanner;

// 3.输入两个正整数m和n，求其最大公约数和最小公倍数。
public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int max = scanner.nextInt();
        int min = scanner.nextInt();
        int b = 1;
        int a = 1;
        if (min > max) {
            b = min;
            min = max;
            max = b;
        }
        if (max % min == 0) {
            System.out.println("最大公约数是" + min);
            System.out.println("最小公倍数是" + max);
        }else {
            while (max % 2 == 0 && min % 2 == 0) {
                max/=2;
                min/=2;
                a *= 2;
            }
            while (max % 3 == 0 && min % 3 == 0) {
                max/=3;
                min/=3;
                a *= 3;
            }
            while (max % 5 == 0 && min % 5 == 0) {
                max/=5;
                min/=5;
                a *= 5;
            }
        }
        System.out.println("最小公约数是"+(max*min*a));
        System.out.println("最大公倍数是"+a);
    }
}
