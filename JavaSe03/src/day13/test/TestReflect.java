package day13.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       /* Class cla1 = Class.forName("java.lang.String");
        Method[] methods = cla1.getMethods();
        Object o = cla1.newInstance();
        System.out.println(o instanceof String);
        //System.out.println(o);
        Field[] fields = cla1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/
/*
        for (Method method : methods) {
            System.out.println(method);
        }*/
        Class cla1 = Class.forName("day13.test.Student");
        Method[] methods = cla1.getMethods();
        Object o = cla1.newInstance();
        System.out.println(o instanceof String);
        //System.out.println(o);
        Field[] fields = cla1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

}
