package day05.home;

import day01.S;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestNameSort{
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王三");
        list.add("花木兰");
        list.add("哈哈哈");
        list.sort(Collator.getInstance(java.util.Locale.CHINA));
        //
        System.out.println(list);

    }

}
