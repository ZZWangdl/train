package day03;

import java.util.Scanner;

public class Work03 {
    //        3)从键盘上输入正数和负数,分别统计正数的个数和负数的个数,并计算所有数的和.输入0表示结束.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        int positive = 0;
        int negative = 0;
        while (num != 0) {
            System.out.println("请输入整数（正数负数都可以），输入0表示结束");
             num = scanner.nextInt();
            if (num > 0) {
                positive++;
            } else {
                negative++;
                System.out.println(546465);
            }
            sum += num;
        }
        System.out.println("正数一共输入了"+positive+"次");
        System.out.println("负数一共输入了"+--negative+"次");
        System.out.println("所有正负数之和为"+sum);
    }
}
