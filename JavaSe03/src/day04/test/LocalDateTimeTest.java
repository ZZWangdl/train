package day04.test;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
       /* System.out.println(time.getYear());
        System.out.println(time.getMonth());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getHour());*/
        DateTimeFormatter dft= DateTimeFormatter.ofPattern("yyyy-MM-dd HH");//这一行必须最少加上小时不然会报异常.DateTimeParseException
        System.out.println(time.format(dft));
        String s = "1999-08-14 12";
        System.out.println(LocalDateTime.parse(s, dft));

    }
}
