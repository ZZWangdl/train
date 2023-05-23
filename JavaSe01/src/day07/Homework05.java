package day07;

import com.sun.javafx.image.BytePixelSetter;

public class Homework05 {
    //        5)求1+2!+3!+...+20!的和
    public static void main(String[] args) {
        System.out.println((long) factorial(20));
    }

    public static double factorial(double n) {
        double sum = 0;
        double product = 1;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product + factorial(n - 1);
    }
    // factorial 阶乘  product 乘积
}
