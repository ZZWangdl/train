package day06.test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrintMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("统一",null);
        map.put(null,null);
        map.put("nongfu","哈哈哈");
        map.put("yibao","无敌");
        map.put("whh","博楞个");
        //通过foreach遍历 map.keyset 返回的set集合 在通过get(key)获取value的值
     /*   for (String s : map.keySet()) {
            System.out.print(s" "+map.get(s));
        }*/


        //------------------------------------------------------------------
        //通过 entrySet获取set 集合  foreach遍历 通过entry的方法getkey getvalue获取值
        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print(" "+entry.getKey()+entry.getValue());
        }*/

        //通过keyset或者values返回集合的迭代器获取value或者key
       /* Iterator et = map.keySet().iterator();
        while (et.hasNext()) {
            System.out.println(map.get(et.next()));
        }*/


    }
}
