package day09.test;

import day09.home.Test;

import java.io.*;

public class FileInputStreamTest2 {
    public static void main(String[] args)  {

        try (
                FileInputStream in = new FileInputStream("C:\\we\\test\\b.txt");
                OutputStream out = new FileOutputStream("C:\\we\\test\\c.txt");
        ) {
            try {
              /*  int len = in.read();
                in.skip(5);
                System.out.println(len);*/
                byte[] b = new byte[6];
                int len = in.read(b);
                while (len != -1) {
                    out.write(b, 0, b.length);
                    System.out.println(new String(b, 0, len));//读多少文件就写多少文件
                    len = in.read(b);
                }

            }  catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
