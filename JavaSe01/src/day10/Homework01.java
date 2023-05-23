package day10;

public class Homework01 {
    /*     1                                                                         *
          1 1                                                                       *  *
         1 2 1                                                                     * *  *
        1 3 3 1                                                                   * *  *  *
       1 4 6 4 1
       */
    public static void main(String[] args) {
        int[][] num = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 4, 1}, {1, 4, 6, 4, 1}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(" " + num[i][j]);
            }
            System.out.println();
        }
        /**
         * 打印三角形
         */
//        int a=10;
//        for (int i = 1; i <a ; i++) {
//
//            for (int j = 0; j <a-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }
    }

}
