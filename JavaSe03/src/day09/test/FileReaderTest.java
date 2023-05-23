package day09.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("C:\\we\\test\\b.txt");
            char[] c = new char[2];
            int len = reader.read(c);
            while (len!=-1){
            System.out.print(new String(c,0,len));
                len= reader.read(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                reader.close();
            }
        }


    }
}
