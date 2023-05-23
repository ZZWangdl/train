package day10.home;

import java.io.*;

public class FielTestDirs {
    public static void main(String[] args) {
        File file = new File("C:\\we");
        searchFiles(file);

    }

    /**
     * 遍历c:we下所有文件和文件夹
     * @param file
     */
    private static void searchFiles(File file) {
        File[] files = file.listFiles();
        String path = "" ;
        for (File file1 : files) {
            path = "" ;
            if (file1.isDirectory()) {
                searchFiles(file1);
                path += file1.getAbsolutePath();
            }
            if (file1.isFile()) {

                path += file1.getAbsolutePath();
            }
            System.out.println(path);
            try {

                copyDirs(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 在新的目录下创建目录与文件名
     * @param path
     * @throws IOException
     */
    private static void copyDirs(String path) throws IOException {
        String copy = "C:\\a" + path.substring(5);
        //System.out.println(copy);
        File file = new File(copy);
        File file1 = new File(path);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        if (!file.exists()) {
            if (file1.isDirectory()) {
                file.mkdirs();
            }
        }
        if (file1.isFile()) {
            System.out.println(1111);
            copyfiel(path, copy);
        }
    }

    /**
     * 拷贝文件
     * @param path
     * @param copy
     */
    private static void copyfiel(String path, String copy) {
        BufferedInputStream buff = null;
        BufferedOutputStream out = null;
        try {
            buff = new BufferedInputStream(new FileInputStream(path));
            out = new BufferedOutputStream(new FileOutputStream(copy));
            byte[] bytes = new byte[1024 * 8];
            int len = buff.read(bytes);
            while (len != -1) {

                out.write(bytes, 0, len);
                len = buff.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
}
