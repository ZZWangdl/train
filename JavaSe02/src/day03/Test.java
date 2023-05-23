package day03;

import java.security.SecureRandom;

public class Test {

   protected int a=0;
   protected String aa="we";
    public static void main(String[] args) {
        //String a = "aa";
        String a = new String("aa");
        add(a);
        System.out.println("main中的a为：" + a.hashCode());
    }

    private static void add(String a) {
        System.out.println(a.hashCode());
        a = "12234";
        System.out.println("add中的a为：" + a.hashCode());
    }
}

