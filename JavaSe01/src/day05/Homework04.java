package day05;
// 4.输出如下效果
//          *
//         ***
//        *****
//         ***
//          *
public class Homework04 {
    public static void main(String[] args) {
        int a = 3;
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a-i-1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a-1; i >0 ; i--) {
            for (int k = 0; k<a-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}