package day06.home;

import java.util.HashMap;

public class HomeWork02 {
    public static void main(String[] args) {
        String str ="adfklajfkljfjslkjfgjsgjhdfjhadlsjfaljflasjflsjfldjafslkjhjlghjf";
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();

            int count =1;
            for (int j = 0; j < chars.length; j++) {
                if (!map.containsKey(chars[j])) {
                    map.put(chars[j],count);
                    continue;
                }
                    map.put(chars[j],map.get(chars[j])+1);
            }
        System.out.println(map);//{a=6, s=6, d=4, f=11, g=3, h=4, j=15, k=4, l=10}
    }
}
