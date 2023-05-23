package day03;

import java.util.Scanner;

public class Work01 {
    /*1)计算n!
    注意：0! = 1


*/


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数（计算阶乘）");
        int a=scanner.nextInt();
        int total=1;
        for (int i = 1; i <=a; i++) {
            total*=i;
        }
        System.out.println(total);
    }
}
