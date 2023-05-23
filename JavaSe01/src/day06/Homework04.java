package day06;

public class Homework04 {
    //4)计算下列数列的和
    public static void main(String[] args) {
        double a=1.0;
        double b=2*a+1;
        double sum=0;
        for (double i = 1; i <=97 ; i+=2) {
            System.out.println(i+"/"+(i+2));
            sum+=i/(i+2);
        }
        System.out.println(sum);
    }
}
