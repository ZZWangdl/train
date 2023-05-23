package day09;

import java.util.Scanner;

public class Homework01 {
    //    1.编写程序，输入10个数存放在数组中，找出最大数以及下标.
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        int[] num = new int[10];
        int max= 0;
        int index=-1;
        System.out.println("请输入十个整数");
        for (int i = 0; i < 10; i++) {
            num[i] = output.nextInt();
            if (i ==0) {
                max=num[i];
                index=0;
            }
            if (num[i] > max) {
                max=num[i];
                index=i;
            }
            }
        System.out.println("十个整数当中的最大值为"+max+",其下标为"+index);
    }
}
