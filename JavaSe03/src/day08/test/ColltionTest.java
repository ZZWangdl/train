package day08.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColltionTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"阿道夫","小矮人","大魔王");
        list.stream().forEach(System.out::println);
    }
}
