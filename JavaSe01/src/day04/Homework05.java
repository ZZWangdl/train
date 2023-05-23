package day04;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        //5、求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
        //    例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加由键盘控制。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入相加的数字");
        int num = scanner.nextInt();
        int sum = 0;
        int a = num;
        String s = "";
        System.out.println("请输入相加的次数");
        int total = scanner.nextInt();
        for (int i = 0; i < total; i++) {
            sum += a;
            s += "" + a + "+";
            a = 10 * a + num;
        }
        System.out.print(s.substring(0, s.length() - 1));
        System.out.print("=" + sum);
    }
}
