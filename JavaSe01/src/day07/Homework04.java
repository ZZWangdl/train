package day07;

public class Homework04 {
    //        4)定义一个方法判断一个数是否为回文素数. 回文素数指一个数同时为素数和回文数。
//        如131是一个素数，同时也是一个回文数。编写程序，显示前100个回文素数，每行显示10个。
    public static void main(String[] args) {
        int count = 0;
        for (int n = 2; ; n++) {
            if (palindromic(n) && prime(n)) {
                count++;
                System.out.print(n + "\t  ");
                if (count % 10 == 0) {
                    System.out.println();
                }
                if (count == 100) {
                    break;
                }
            }
        }


    }
/**
 * 判断是否为素数
 *
 * **/
    private static boolean prime(int i) {
        boolean a = true;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                a = false;
                break;
            }
        }
        if (a) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 判断是否为回文数
     * @param n
     * @return
     */
    public static boolean palindromic(int n) {
        String a = ""+n;
        StringBuffer buffer = new StringBuffer(a);
        if (a.equals(buffer.reverse().toString())) {
            return true;
        }
        return false;

    }

}

