package day04;

import java.util.Scanner;

public class Homework02 {
    //2、输入一批整数，输出其中最大值和最小值，输入数字0结束循环。
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=1;
       int max=0;
       int min=999999999;
        while (a!=0){
            System.out.println("请输入一批整数，输入结束请按0");
            a=scanner.nextInt();
            if (a == 0) {
                break;
            }
            if (a >max) {
                max=a;
            }else if (min >a) {
                min=a;
            }
        }
        System.out.println("这一批整数的最大值是"+max);
        System.out.println("这一批整数的最小值是"+min);

    }
}
