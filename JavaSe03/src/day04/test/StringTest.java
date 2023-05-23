package day04.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "hello world";
        byte[] bytes = str1.getBytes();
        //str1.split("[adfsf]",4);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String regex = "[0-9]\\d{16}[0-9X]";
        System.out.println(s.matches(regex));
        System.out.println(s);
//        String substring = s.substring(6, 14);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        try {
//        System.out.println(sdf.format(sdf.parse(substring)));
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }
}
