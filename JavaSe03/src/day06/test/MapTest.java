package day06.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("统一",null);
        map.put(null,null);
        map.put("nongfu","哈哈哈");
        map.put("yibao","无敌");
        map.put("whh","博楞个");
        //map.put(1,null);
        System.out.println(map);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+ entry.getValue());
        }
        Iterator itr = map.values().iterator();
       /* while (itr.hasNext()) {
            String nxt =(String) itr.next();
            if (("无敌").equals(itr.next())) {
                itr.remove();
            }
        }
        System.out.println("删除后---------------+----------");
        System.out.println(map);*/
        }

}
