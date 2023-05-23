package day06;

import java.util.Scanner;

public class Homework05 {
    //5)判断一个数是否为素数, 素数又叫质数，是除了1和它本身之外不能被其他数整除的数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数n的值");
        int n = scanner.nextInt();
        boolean a=true;
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if (n%i == 0) {
                a=false;
                break;
            }
        }
        if (a == true) {
            System.out.println(n+"是一个素数");
        }else {
            System.out.println(n+"不是一个素数");
        }
    }
}
