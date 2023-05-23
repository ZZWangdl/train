package day08;

import java.util.Scanner;

public class Homework05 {
    //            5.输入5个数存放在数组中，输出其中的最小数
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入五个整数");
        int []num=new int[5];
        int temp=0;
        for (int i = 0; i <5 ; i++) {
            num[i]= scanner.nextInt();
            if (i == 0) {
                temp=num[i];
            }
            if (temp >num[i]) {
                temp=num[i];
            }
        }
        System.out.println("五个数中的最小值为"+temp);

    }
}
