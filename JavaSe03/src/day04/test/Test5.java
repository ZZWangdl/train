package day04.test;

public class Test5 {
    public static void main(String[] args) {
        String s1 = "aa";
        String a = new String("aa");
        String b = new String("aa");
        System.out.println(a==b);//false
        System.out.println(a==s1);//false
        String s2 = "a"+"a";
        System.out.println(s2==s1);//77true
        System.out.println(s2==b);
    }
}
