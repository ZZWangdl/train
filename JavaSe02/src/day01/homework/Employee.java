package day01.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    //    第一题：
//    定义员工类：Employee，员工属性包括：
//    工号
//            姓名
//    职位
//            工资
//    入职时间
//    编写测试类：EmployeeTest
//    创建多个员工对象，访问员工的所有属性。
//    将整个程序的内存图画出来。
    String code;
    String name;
    String title;
    double salary;
    String date;

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", date='" + date + '\'' +
                '}';
    }
}
