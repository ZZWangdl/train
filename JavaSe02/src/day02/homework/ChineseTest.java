package day02.homework;

public class ChineseTest {
    public static void main(String[] args) {
        Chinese chinese = new Chinese("张三","23456346562342",33,true);
        chinese.print();
        Chinese c2 = new Chinese();
        System.out.println(c2.nation);
        c2=null;
        System.out.println(c2.nation);
    }
}
