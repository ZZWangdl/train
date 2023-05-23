package day03;

/**
 * 测试同一变量对于不使用第三方变量而为0 的状况
 */
public class Test {

    public static void main(String[] args) {
        int i = 5;
        i = i + i;
        System.out.println(i);
        i=i-i;
        System.out.println(i);
    }
}
