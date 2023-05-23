package demo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num=scanner.nextDouble();
        String result=Test.judge(num);
        System.out.println(result);

    }

    private static String judge(double num) {
        if (num > 0) {
            return "是正数";
        }else if(num<0) {
            return "是负数";
        }
        return "既不是正数也不是负数";
    }
}
