package day02.test3;

/**
 * 删除数组元素类
 */
public class DeleteElement {
    public static void main(String[] args) {
        int[] num = {11, 22, 33, 44, 55};
        deleteElement(num, 2);
    }

    /**
     * 删除数组元素
     *
     * @param num 数组
     * @param i   删除元素下标
     */
    public static void deleteElement(int num[], int i) {
        int a = i;
        int[] delete = new int[num.length - 1];
        System.arraycopy(num, 0, delete, 0, i);
        System.arraycopy(num, i + 1, delete, i, num.length - i - 1);
        num = delete;
        for (int i1 : delete) {
            System.out.println(i1);

        }
    }
}
