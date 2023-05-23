package day07.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //方法一 使用 类加载器加载
        Properties pro = new Properties();
        InputStream in = PropertiesTest.class.getClassLoader().getResourceAsStream("resources/jdbc.properties");
        pro.load(in);
        System.out.println(pro.getProperty("url"));
        System.out.println(pro.getProperty("ur23l"));
        //方法二  使用ResourceBundle类进行加载 直接调用
        /*ResourceBundle re = ResourceBundle.getBundle("resources/jdbc");
        System.out.println(re.getString("url"));
        System.out.println(re.getString("url3"));*/
    }
}
