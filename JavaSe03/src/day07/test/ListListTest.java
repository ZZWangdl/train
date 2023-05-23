package day07.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListListTest {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap();
        String str1 = "https://www.haike?name =wang&pass=123&hobby=aa&hobby=bb&hobby=cc&";
        String[] split = str1.split("[?=&]");
       /* for (String s : split) {
            System.out.println(s);
        }*/

        for (int i = 1; i < split.length; i += 2) {
            List list = new ArrayList();
            if (map.containsKey(split[i])) {
                map.get(split[i]).add(split[i + 1]);
                continue;
            }
                list.add(split[i + 1]);
                map.put(split[i], list);
        }
        System.out.println(map);
    }
}
