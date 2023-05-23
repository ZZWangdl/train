package day08.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTets {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("wahaha");
        list.add("yibao");
        list.add("nongfu");
        list.add("tongyi");
        list.add("kangshifu");
        //遍历流中的数据foreach以下两种都可以遍历
        list.stream().forEach(s-> System.out.println(s));
        list.stream().forEach(System.out::println);
        long count = list.stream().count();
        System.out.println(count);
        list.stream().collect(Collectors.toSet());
        for (String s : list) {
            System.out.println(s);
        }
        //判断流中所有数据中最大值 括号提供比较条件
        System.out.println(list.stream().max((o1, o2) -> o1.compareTo(o2)));
        //流中的数据是否全部匹配给定条件
        boolean b = list.stream().allMatch(s -> s.length() > 5);
        System.out.println(b);
    }
}
