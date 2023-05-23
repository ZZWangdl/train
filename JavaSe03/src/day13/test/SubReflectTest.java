package day13.test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ResourceBundle;

/**
 * 拼接方法名 参数名
 */
public class SubReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {

     ResourceBundle rs = ResourceBundle.getBundle("resources/name");
        String name = rs.getString("name");
        Class<?> cla = Class.forName(name);
        Method[] methods = cla.getDeclaredMethods();
        for (Method method : methods) {
            //System.out.println(method);
            int modifiers = method.getModifiers();
            System.out.print(Modifier.toString(modifiers));
            Class type = method.getReturnType();
            System.out.print("  "+type);
            System.out.print(" " +method.getName());
            Class<?>[] parameterTypes = method.getParameterTypes();
                System.out.print("(");
            for (Class<?> parameterType : parameterTypes) {
                System.out.print(""+parameterType.getSimpleName());
                //System.out.print(" "+method.getName());
            }
            /*Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.print(parameter);
            }*/
            System.out.println();
        }

    }
}
