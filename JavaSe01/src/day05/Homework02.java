package day05;

/*
  2.判断101-200之间有多少个素数，并输出所有素数
*/
public class Homework02 {
    public static void main(String[] args) {
        int total = 0;
        boolean a=true;
        for (int i = 101; i < 201; i += 2) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i%j == 0) {
                        a=false;
                        break;
                    }
                }
            if (a == true) {
                System.out.println(i);
                total++;

            }else {
                a=true;
            }
            }
        System.out.println("100~200之间的素数一共有"+total+"个");
        }
       // System.out.println("100~200之间的素数一共有"+total+"个");

    }



