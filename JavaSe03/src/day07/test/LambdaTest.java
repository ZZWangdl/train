package day07.test;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
            List <String> list = new ArrayList<>();
            list.add("yibao");
            list.add("kangshif");
            list.add("Wahh");
            list.add("nongfu");
            list.add("tongyi");
            /*list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });*/
           // list.sort((o1,o2)-> o1.compareTo(o2));

           // System.out.println(list);//[Wahh, kangshif, nongfu, tongyi, yibao]
            /*list.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println(s);
                }
            });*/
        //map.forEach((s,integer)-> System.out.println(s+"--->"+integer));这种两个参数的就不能写成下面这种形式
        //list.forEach(System.out::println);
        //list.forEach(s->System.out.println(s));//假如只有一个参数的时候,可以写成下面的||||
        list.forEach(System.out::println);
    }
}
