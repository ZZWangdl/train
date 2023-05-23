package day10;

public class Homework05 {
    // 5.打印数组a中出现奇数次的数字
//    int[] a = { 1, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 8 };
//    例如：1出现次数：14出现次数：3 6出现次数：5 8出现次数：1
    //statistics 统计
    public static void main(String[] args) {
        int[] num = new int[]{1, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 8};
        statistics(num);
    }

    private static void statistics(int[] num) {
        int temp = 0;
        for (int i = 0; i < num.length; i++) {

            temp = num[i];
            // System.out.println(temp);
            if (i == num.length - 1) {
            } else {
                if (temp == num[i + 1]) {
                    continue;
                }
            }
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (temp == num[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(temp+"出现的次数是："+count);
            }


        }
    }
}
