package day03;

/**
 * 选择排序
 */
public class Choose {
    public static void main(String[] args) {
        int[] num = {11, 33, 555, 66, 666};
        choose(num);
    }

    private static void choose(int[] num) {
        int temp=0;
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 1; j < num.length-i; j++) {
                if (num[temp] > num[j]) {
                    temp=j+1;
                }
            }
            num[i]=0;

        }

    }
}
