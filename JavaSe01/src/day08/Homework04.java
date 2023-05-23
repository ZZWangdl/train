package day08;

import java.util.Scanner;

public class Homework04 {
    //4.从键盘输入10个整数，合法值为1、2或3，不是这三个数则为非法数字。
//    试编程统计每个合法整数和非法数字的个数。
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        int[] num = new int[10];
        int count = 0;
        System.out.println("请输入十个整数");
        for (int i = 0; i < 10; i++) {
            num[i] = output.nextInt();
            if (num[i] >= 1 && num[i] <= 3) {
                count++;
            }
        }
        System.out.println("输入的整数中一共有" + count + "个合法的");
    }
}
