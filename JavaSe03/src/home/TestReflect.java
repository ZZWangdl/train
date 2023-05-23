package home;

import java.lang.reflect.Method;

/**
 * @author 王龙
 * @version 1.0
 * @project train
 * @description
 * @date 2022/09/17 20:24:57
 */
public class TestReflect {
    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("home.Goods");
        Object obj = aClass.newInstance();
       /* Method[] methods = obj.getClass().getMethods();
        for (Method method : methods) {
           String s =method.getName();
          // method.invoke(obj,s);
            System.out.println(s);
        }*/
        Method setName = obj.getClass().getDeclaredMethod("setName",String.class);
        setName.invoke(obj,"sefef");
        Method getName = obj.getClass().getDeclaredMethod("getName");
        Object wafw = getName.invoke(obj);
        System.out.println(obj);

    }


}
