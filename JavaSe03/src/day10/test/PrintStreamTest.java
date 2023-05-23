package day10.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream pri = null;
        try {
            pri = new PrintStream(new FileOutputStream("C:\\we\\test\\b.txt", true));
           // PrintStream pri1 = new PrintStream(new FileOutputStream("C:\\we\\testr\\b.txt", true));
            pri.println("使用打印流打印测试");
            System.out.println("使用打印流打印测试");
            System.setOut(pri);
            pri.print("应该不会出现在控制台");
            pri.println("这次不会打印到控制台了哦");
        } catch (FileNotFoundException e) {
            e.printStackTrace(pri);
        }
    }
}
