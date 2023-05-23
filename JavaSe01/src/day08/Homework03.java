package day08;

public class Homework03 {
    //            3.现有一组数据电脑、鼠标、键盘、显示器，存放在数组中，并使用两种方法遍历数组
    public static void main(String[] args) {
        /*
        * for 直接遍历
        * */
        String []com={"电脑", "鼠标","键盘","显示器"};
        for (int i = 0; i <com.length ; i++) {
            System.out.println(com[i]);
        }
/*
* foreach循环遍历  冒号后面是遍历的数组  前面是与数组类型相对应的类型去接收
* */
        for (String a:com) {
            System.out.println(a);
        }
    }
}
