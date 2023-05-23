package day10;

import java.util.Random;

public class Homework04 {
    //            4.随机生成5-65之间的10个随机整数，使用插入排序法进行排序（大小），
//    然后在定义一个方法实现对排序后的数组进行逆序输出。
    public static void main(String[] args) {
        Random rand = new Random();
        int[] num = new int[10];
        System.out.print("最初生成的数组:");
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(61) + 5;
            System.out.print(num[i] + " ");
        }
        intsert(num);
        System.out.println();
        System.out.print("插入排序后的数组为：");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    private static void intsert(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            for (int j = i; j > 0; j--) {
                if (num[j] > num[j - 1]) {
                    break;
                }
                temp = num[j];
                num[j] = num[j - 1];
                num[j - 1] = temp;

            }

        }
    }
}
