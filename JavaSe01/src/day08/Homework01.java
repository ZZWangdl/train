package day08;

public class Homework01 {
    //    1.假如有一组数据{99,345,-6},遍历数组，要求：使用方法完成。
    public static void main(String[] args) {
        int[] num = {99, 345, -6};
        traverse(num);
    }
/*
*遍历数组元素
* */
 public  static void traverse(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }

    }


}
