package day09.home;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\we\\test\\c.txt");
        String copypath = "C:\\we\\test\\d.txt";
        File copy = new File(copypath);
        BufferedInputStream buff = null;
        BufferedOutputStream out = null;
        try {
            buff = new BufferedInputStream(new FileInputStream(file));
            out = new BufferedOutputStream(new FileOutputStream(copy));
            byte[] bytes = new byte[1024 * 8];
            int len = buff.read(bytes);
            while (len != -1) {
                out.write(bytes, 0, len);
                // System.out.println(new String(bytes,0,len));
                len = buff.read(bytes);
            }
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeall(out,buff);

        }


    }

    public static void closeall(BufferedOutputStream out, BufferedInputStream buff) {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (buff != null) {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
