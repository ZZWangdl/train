package day08.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("wahaha");
        list.add("yibao");
        list.add("nongfu");
        list.add("tongyi");
        list.add("tongyi");
        list.add("kangshifu");
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        });*/
        //过滤器
        list.stream().filter(s -> s.length() < 8).forEach(s-> System.out.print(s+" "));
        System.out.println();
        //去重
        list.stream().distinct().forEach(s -> System.out.print(s+" "));
        System.out.println();

        Stream<String> limit = list.stream().limit(2);
        //mapfunction 就是筛选规则
        list.stream().map(s -> s.split("")).flatMap(arr-> Arrays.stream(arr)).forEach(sss-> System.out.println(sss));
    }
}
