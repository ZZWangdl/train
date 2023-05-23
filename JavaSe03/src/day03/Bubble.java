package day03;

/**
 *冒泡排序
 */
public class Bubble {
    public static void main(String[] args) {
        int[] num = {11, 33, 555, 66, 666};
        bubbleSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }

    private static void bubbleSort(int[] num) {
        int temp=0;
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j <num.length-i-1 ; j++) {
            if (num[j] < num[j+1]) {
                temp=num[j+1];
                num[j+1]=num[j];
                num[j]=temp;
            }
            }

        }
    }
}
