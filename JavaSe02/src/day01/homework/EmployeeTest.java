package day01.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-ww hh:mm:ss");
        employee.date=sim.format(new Date());
        System.out.println(employee.date);
        employee.code="001";
        employee.name="张三";
        employee.salary=9999;
        employee.title="打工人";
        System.out.println(employee);

    }
}
