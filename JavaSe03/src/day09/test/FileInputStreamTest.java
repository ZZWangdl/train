package day09.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\we\\test\\a.txt");
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            System.out.println(file.length());
            System.out.println(in.available());
            byte[] b = new byte[4];
            while ((in.read(b)) != -1) {
                System.out.println(Arrays.toString(b));
                System.out.println(new String(b));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }

    }
}
