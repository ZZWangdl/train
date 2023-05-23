package day05.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> array = new ArrayList<>();
        array.add("生");
        array.add("活");
        array.add("不");
        array.add("易");
        array.add("处");
        array.add("处");
        array.add("碰");
        array.add("壁");
        System.out.println(array);
/*
        for (String s : array) {
            if("生".equals(s)){
                array.remove(s);
            }
        }
*/
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()){
            String s =iterator.next();
            if ("处".equals(s)) {
                iterator.remove();//array.remove(s)也会报异常ConcurrentModificationException并发修改异常
            }
        }
            System.out.println(array);
    }
}
