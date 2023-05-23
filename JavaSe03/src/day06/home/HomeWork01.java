package day06.home;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 有字符串"adfklajfkljfjslkjfgjsgjhdfjhadlsjfaljflasjflsjfldjafslkjhjlghjf"统计字符串中每个字符出现的次数把保存到Map集合中
 *
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String str ="adfklajfkljfjslkjfgjsgjhdfjhadlsjfaljflasjflsjfldjafslkjhjlghjf";
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 'a'; i <= 'z'; i++) {
            int count =0;
            for (int j = 0; j < chars.length; j++) {
                if ((char)i==chars[j]) {
                    count++;
                }
            }
            if (count != 0) {
                map.put((char)i,count);
            }
        }
        System.out.println(map);
    }
}
