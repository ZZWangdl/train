package day02.home;

/**
 * 2 有存储整数的数组,  int [] ints = {34,675,23,435,56,78,45,23,65}; 编写代码, 实现数组元素的乱序,  思路: 遍历数组元素, ints[i] 与 ints[x] 交换,   下标x随机生成
 */
public class Homework02 {
    public static void main(String[] args) {
        int [] ints = {34,675,23,435,56,78,45,23,65};
        changes(ints);
        System.out.print("变化后的数组为:");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(" "+ints[i]);

        }
    }

    /**
     * 该方法用来将数组乱序输出
     * @param ints
     */
    private static void changes(int[] ints) {
        int temp;
        System.out.print("原数组为:");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(" " +ints[i]);
        }
        for (int i = 0; i < ints.length; i++) {
            temp = ints[i];
            int j=(int) (Math.random() * ints.length);
            //System.out.println(j);
            ints [i] = ints[j];
            ints[j]=temp;
        }

    }
}
