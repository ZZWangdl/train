package day10.test.seriliz;

import sun.nio.cs.ext.GBK;

import java.io.*;
import java.sql.SQLOutput;

public class OutputWrtierTest {
    public static void main(String[] args) {
        m1();
        //readFile();
    }

    private static void readFile() {
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("C:\\we\\test\\k.txt");
            InputStreamReader in = new InputStreamReader(fi, "GBK");
            char[] chars = new char[4];
            int len = in.read(chars);
            while (len!=-1){
                System.out.print(new String(chars));
                len = in.read(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void m1() {
        try {
            FileOutputStream ot = new FileOutputStream("C:\\we\\test\\k.txt",true);
            OutputStreamWriter ow = new OutputStreamWriter(ot,"GBK");
            ow.write("这是以GBk的方式写入的字符\n");
            ot.close();
            ow.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
