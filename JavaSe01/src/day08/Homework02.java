package day08;

import java.util.Scanner;
//            2.依次输入五句话，然后将它逆序输出。使用数组完成。
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        int index = -1;
        String s = scanner.next();
        for (int i = 0; i < 5; i++) {
            str[i] = scanner.next();
            index++;
        }

        while (index != -1) {
            System.out.println(str[index]);
            index--;
        }
    }

}
