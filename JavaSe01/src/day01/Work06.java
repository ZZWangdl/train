package day01;

import java.util.Scanner;

public class Work06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三角形的三边长度");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int i = 0;
        if (c > 0 && b > 0 && a > 0) {
            if (a < b) {
                i = a;
                a = b;
                b = i;
            }
            if (a < c) {
                i = a;
                a = c;
                c = i;
            }

        }
        if (a < (b + c)) {
            System.out.println("可以构成三角形");
        } else {
            System.out.println("不满足构成三角形的条件");
        }
    }
}
