package day02.home;

/**
 * 4 有存储整数的数组,  int [] ints = {34,65,23,435,56,78,435,23,65}; 编写代码, 找出数组中最大元素的索引值,不考虑重复元素思路:    定义变量保存最大元素索引值 int max = 0;   从前向后遍历数组的元素元素, 如果有某个元素比max标识的元素还大,则这个元素就是当前最大的, 把这个元素的索引值保存到max变量中
 */
public class Homework04 {
    public static void main(String[] args) {
        int[] ints = {34, 65, 23, 435, 56, 78, 435, 23, 65};
        maxArray(ints);
    }

    private static void maxArray(int[] ints) {
        int index = -1;
        int temp = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                temp = ints[i];
            }
            if (ints[i] > temp) {
                temp = ints[i];
                index = i;
            }
        }
            System.out.println("该数组中最大的数是:" + temp + ",其索引下标为:" + index);
    }
}
