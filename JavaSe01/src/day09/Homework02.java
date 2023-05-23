package day09;

import day08.Homework01;

public class Homework02 {
    //2.假设有一个长度为5的数组，如下所示：
    //    int[] array=new int[]{1,3,-1,5,-2};
//    现要创建一个新数组newArray[]，要求新数组中的元素与原数组中的元素逆序，并且如果原数组中的元素值小于0，在新数组中按0存储。试编程输出新数组中的元素。
//    新数组中最终存放是：0,5,0,3,1
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, -1, 5, -2};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[array.length - i - 1] = 0;
                continue;
            }
            newArray[array.length - 1 - i] = array[i];
            System.out.println(111);
        }
        Homework01.traverse(newArray);
    }
}
