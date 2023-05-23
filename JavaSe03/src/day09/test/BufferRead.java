package day09.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferRead {
    public static void main(String[] args) {
        try {
            BufferedInputStream buff = new BufferedInputStream(new FileInputStream("ef"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
