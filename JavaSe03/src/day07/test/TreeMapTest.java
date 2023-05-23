package day07.test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,Integer> tree = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        tree.put("zhagnsan",12);
        tree.put("wahaha",35);
        tree.put("wakk",53);
        tree.put("yibao",5);
        for (Map.Entry<String, Integer> entry : tree.entrySet()) {
            System.out.println(entry);
        }
    }
}
