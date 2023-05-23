package day05;

//1.有一分数序列：2/1，3/2，5/3，8/5，13/8 21/13...求出这个数列的前20项之和。
public class Homework01 {
    public static void main(String[] args) {
       double sum = 0;
        double a = 2;
        double b = 1;
        double c = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println(a + "/" + b);
            sum+=a/b;
            c = a;
            a = a + b;
            b = c;

        }

        System.out.println(sum);
    }
}
