package day13.test;

import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

public class ReflectTest {
    public static void main(String[] args) {
        ResourceBundle re = ResourceBundle.getBundle("resources/name");
        //System.out.println(re.getString("name"));
        String name = re.getString("name");
        try {
            Class<?> c = Class.forName(name);
            int modifiers = c.getModifiers();
            System.out.println(Modifier.toString(c.getModifiers()));
            //  System.out.println(c.getName());
            String name1 = c.getSuperclass().getName();
            System.out.println(name1);
            Class<?>[] interfaces = c.getInterfaces();
            for (Class<?> anInterface : interfaces) {
                System.out.println(anInterface.getSimpleName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
