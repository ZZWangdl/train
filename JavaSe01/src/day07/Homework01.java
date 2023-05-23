package day07;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
//        1)定义方法把十进制数转换为十六进制
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int m=scanner.nextInt();
        change(m);

    }
    public  static void change(int m){

        int a = m;
        int b = 0;
        String aa = "";
        while (a / 16 != 0) {
            b = a % 16;
            System.out.println(b);
            if (b > 9) {
                switch (b) {
                    case 10:
                        aa += "A";
                        break;
                    case 11:
                        aa += "B";
                        break;
                    case 12:
                        aa += "C";
                        break;
                    case 13:
                        aa += "D";
                        break;
                    case 14:
                        aa += "E";
                        break;
                    case 15:
                        aa += "F";
                        break;

                }
            } else {
                aa += b;
            }
            a /= 16;
        }
        System.out.println(a);
        if (a > 9) {
            switch (a) {
                case 10:
                    aa += "A";
                    break;
                case 11:
                    aa += "B";
                    break;
                case 12:
                    aa += "C";
                    break;
                case 13:
                    aa += "D";
                    break;
                case 14:
                    aa += "E";
                    break;
                case 15:
                    aa += "F";
                    break;

            }
        } else {
            aa += a;
        }


        char[] c = aa.toCharArray();
        System.out.print(m + "十六进制为；ox");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}
