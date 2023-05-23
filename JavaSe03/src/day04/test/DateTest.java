package day04.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        String time = "2020-05-22 05:18:37";//无法理解解决大写字母Y是什么意思
        Date parse = sdf.parse(time);
        System.out.println(sdf.format(parse));
    }
}
