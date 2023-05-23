package day06.test;

import day05.home.CompanyTest;
import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Student {
    public static void main(String[] args) {
       TreeSet<StudentTest> set = new TreeSet<>();//Hashset没有自动排序的功能 hh
        set.add(new StudentTest("zhangsan",22));
        set.add(new StudentTest("wahaha",55));
        set.add(new StudentTest("nongfu",36));
        set.add(new StudentTest("yibao",32));
        System.out.println(set);
    }
}
