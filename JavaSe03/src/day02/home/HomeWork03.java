package day02.home;

/**
 * 3 有存储整数的数组,  int [] ints = {34,675,23,435,56,78,45,23,65}; 编写代码, 实现数组元素的逆序, 再打印int数组的元素时,变为:   65, 23, 45, 78, 56, 435, 23, 675, 34  前一半与后一半交换
 */
public class HomeWork03 {
    public static void main(String[] args) {
        int [] ints = {34,675,23,435,56,78,45,23,65};
        reverses(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(" "+ints[i]);

        }
    }

    private static void reverses(int[] ints) {
        int temp=0;
        for (int i = 0; i <= ints.length/2; i++) {
            temp = ints[i];
            ints[i]=ints[ints.length-i-1];
            ints[ints.length-i-1]=temp;
        }
    }
}
