package day10;

/**
 * 二维数组打印杨辉三角金字塔
 */
public class Homework11 {
    public static void main(String[] args) {
        int[][] num = new int[8][10];
        for (int i = 0; i < num.length; i++) {
            int count = 1;
            for (int j = 0; j < num.length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || count == (i + 1)) {
                    num[i][j] = 1;
                } else {
                    if (i > 3) {
                        num[i][j] = num[i - 1][j - 1] + num[i - 1][j];
                    } else {
                        num[i][j] = i;
                    }
                }
                count++;
                System.out.print(" " + num[i][j]);
            }
            System.out.println();
        }
    }
}
