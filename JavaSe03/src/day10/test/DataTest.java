package day10.test;

import java.io.*;

/**
 * 数据流
 */
public class DataTest {
    public static void main(String[] args) {
        writedata();
        readdata();
    }

    private static void readdata() {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("C:\\we\\test\\b.txt"));
            System.out.println(in.readBoolean());
            System.out.println(in.readInt());
            System.out.println(in.readDouble());
            System.out.println(in.readUTF());
            System.out.println(in.readChar());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void writedata() {
        try {
            DataOutputStream data = new DataOutputStream(new FileOutputStream("C:\\we\\test\\b.txt"));
            data.writeBoolean(false);
            data.writeInt(123);
            data.writeDouble(13.215);
            data.writeUTF("二维");
            data.writeChar('d');
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
