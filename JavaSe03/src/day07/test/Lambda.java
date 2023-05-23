package day07.test;

import java.util.HashMap;

public class Lambda {
    public static void main(String[] args) {
        HashMap<String,Integer> map  = new HashMap<>();
        map.put("nongfu",2);
        map.put("yibao",3);
        map.put("kangshuifu",4);
        map.put("tongyi",6);
        map.put("wahahh",7);
      /*  map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+"--->"+integer);
            }
        });*/
        map.forEach((s,integer)-> System.out.println(s+"--->"+integer));
    }
}
