package day05.test;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.ArrayList;
import java.util.List;

public class ListArrayTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("123");
        list.add("nice");
        list.add("god");
        list.add("wc");
        list.add("who");
       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
       //System.out.println(list);
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println(list.indexOf("god"));
        List list1 = new ArrayList(list);
        list1.add(list);
        list1.removeAll(list);
//        for (Object o : list1) {
//            System.out.println(o);
//        }
        System.out.println(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        //System.out.println(list1);
    }
}
