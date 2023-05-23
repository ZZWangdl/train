package day09;

import day08.Homework01;

import java.util.Random;

public class Homework03 {
/*    3.设计一个方法，要求如下：
            1).用于创建并初始化一个int类型数组，存储10个数据，数组的值取自随机数【1-100】之间，并将数组返回
            2).求整个数组数值的总和
            3).求平均数
            4).打印数据
            5).求数组中的最大值，以及最小值*/
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        Homework01.traverse(array);
        System.out.println();
        System.out.println("数组数的平均值为: " + avg(array));
        System.out.println("数组数的和为: " + sum(array));
        System.out.println("数组数的最大值为: " + max(array));
        System.out.println("数组数的最小值为: " + min(array));
    }

    /*
     * 求数组的平均值
     * */
    public static double avg(int array[]) {
        return (double) sum(array) / array.length;

    }

    /*
     * 求数组的总和
     * */
    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    /*
     * 求数组的最大值
     * */
    public static int max(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                max = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /*
     * 求数组的最小值
     * */
    public static int min(int array[]) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                min = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
