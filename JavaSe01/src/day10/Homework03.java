package day10;

public class Homework03 {
    //3.给定两个含有n个元素的有序（非降序）整型数组a和b，求出其共同元素，
//    比如：a = 0, 1, 2, 3, 4，b = 1, 3, 5, 7, 9，输出 1, 3
    public static void main(String[] args) {

    int[] num2=new int[]{1,2,4,5};
    int[] num1 =new int[]{1,2,4,5,22};
    same(num1,num2);
    }

    private static int same(int[] num1, int[] num2) {

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    System.out.println(num1[i]);
                    break;
                }

            }

        }
        return 0;
    }
}
