package demo;

public class Test11 {
    //     2.编写Java代码，假如有两个整数5和10，分别存放在两个变量中，实现两个变量中的值进行互换。
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + ",b=" + b);
    }
}
