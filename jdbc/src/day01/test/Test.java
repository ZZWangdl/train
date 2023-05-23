package day01.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws ParseException {
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("该功能输入教师工号，姓名以及学生的成绩，可以计算输出学生成绩总分和平均分");
        System.out.println("请输入教师工号");
        String TeacherNo = scanner.next();
        System.out.println("请输入教师姓名");
        String name = scanner.next();
        System.out.println("请输入学生人数");
        int total = scanner.nextInt();
        int[] grades = new int[total];
        for (int i = 0; i < total; i++) {
            System.out.println("请输入学生的成绩(一维数组)");
            grades[i] = scanner.nextInt();
        }
         Teacher teacher = new Teacher(TeacherNo,name,grades);
        System.out.println(teacher.showInfo());
*/
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date parse = dateFormat.parse("2023-11-22 12:33");
        Date parse1 = dateFormat.parse("2023-11-22 12:33");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(parse1);
        calendar.add(Calendar.DATE,10);
        System.out.println(calendar2.after(calendar));
        System.out.println(dateFormat.format(calendar.getTime()));

    }
}
