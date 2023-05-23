package day13.test;
/**
 * 通过反射机制修改属性值(包括对于私有变量)和调用方法(包括静态方法)
 */

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConstrucTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
       // Class<?> cla = Class.forName("day13.test.Student");

        Class<Student> cl1 = Student.class;
        Student s1 = cl1.newInstance();
        System.out.println(s1);
        Student student = cl1.getConstructor(String.class, int.class).newInstance("zhangsab",15);
        System.out.println(student);
        Field age = cl1.getField("age");
        age.set(s1,555);
        System.out.println(s1);
        Field name = cl1.getField("name");
        name.set(student,"sss");
        System.out.println(student);
        Method set = cl1.getMethod("setName", String.class);//方法名 后面是参数没有不需要写 有几个写几个
        set.invoke(student,"kkkk");//第一个参数是对象,后面可变参数是值
        System.out.println(student);
        System.out.println(cl1.getMethod("getName").invoke(s1));
        Field gender = cl1.getDeclaredField("gender");
        gender.setAccessible(true);
        gender.set(s1,false);
        System.out.println(s1);
        Method m = cl1.getMethod("m");
        m.invoke(null);

    }
}
