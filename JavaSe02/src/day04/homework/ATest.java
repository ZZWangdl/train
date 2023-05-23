package day04.homework;

import java.util.Scanner;

public class ATest {
    public static void main(String[] args) {
        A a = new A(44);
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("请输入你猜的数字");
        int num = scanner.nextInt();
        a.guess(num);
            if (num == a.getV()) {
                break;
            }
        }
    }
}
