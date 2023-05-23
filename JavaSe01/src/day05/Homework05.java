package day05;
 /*5..输入一个大写字母，比如：输入:F
         输出：
         A
         ABA
         ABCBA
         ABCDCBA
         ABCDEDCBA
         ABCDEFEDCBA*/
public class Homework05 {
    public static void main(String[] args) {
        char c='F';
        for (int i = 65; i <(int)c ; i++) {
            for (int k = 65;  k <=i;  k++) {
                System.out.print((char)k);
            }
            for (int j = i-1; j >=65 ; j--) {
                System.out.print((char)j);
            }
                System.out.println();
        }
    }
}
