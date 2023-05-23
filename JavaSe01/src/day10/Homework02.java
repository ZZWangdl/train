package day10;

import java.util.Scanner;

public class Homework02 {
    //      2.用户从键盘输入若干个数存入数组中，用冒泡排序法对数组排序，比如：1 2 3 4 5 6
//    然后用户从键盘输入一个数，把该数插入数组中，保证插入该数后，数组还是有序的
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int []{5,2,45,3,44};
        buddle(num);

        }

    private static void buddle(int[] num) {
        for (int j = 0; j < num.length; j++) {
            int temp = 0;
            for (int i = 1; i < num.length - j; i++) {
                if (num[i]<num[i-1]) {
                    temp=num[i-1];
                    num[i-1]=num[i];
                    num[i]=temp;
                }
            }
        }
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }

    }
}
