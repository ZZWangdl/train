package day09.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 异常处理
 */
public class Test1 {
    public static void main(String[] args) {
        String path = "c.txt";
        File  file = new File(path);
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
        byte[] b = new byte[10240];
        int reads = in.read(b, 1, b.length);
        System.out.println(Arrays.toString(b));
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }


}
