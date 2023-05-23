package day09.home;

import java.io.*;

public class HomeWork {
    public static void main(String[] args) {
        BufferedInputStream buff = null;
        BufferedOutputStream out = null;
        File file = new File("C:\\Users\\王龙\\Desktop\\video\\video\\js\\001.avi");
        String copypath = file.getParentFile().getParent() + "\\copy\\001.avi";
        File copy = new File(copypath);
        if (!copy.getParentFile().exists()) {
            System.out.println(copy.getParentFile().mkdirs());
        }
        try {
             buff = new BufferedInputStream(new FileInputStream(file));
             out = new BufferedOutputStream(new FileOutputStream(copy));
            byte[] bytes = new byte[1024*8];
            int len = buff.read(bytes);
            while (len!=-1){
                out.write(bytes,0,len);
           // System.out.println(new String(bytes,0,len));
            len=buff.read(bytes);
            }
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            Test.closeall(out,buff);
        }


    }
}
//109 MB (115,236,864 字节)    109 MB (115,243,144 字节)