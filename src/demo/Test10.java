package demo;

import java.util.Scanner;

public class Test10 {
    /*  1.编写Java代码，判断一个数是否能被3和5整除。

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("输入不合法");
        } else {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + "可以被3和5整除");
            } else {
                System.out.println(num + "不可以被3个5整除");

            }
        }
    }
}
