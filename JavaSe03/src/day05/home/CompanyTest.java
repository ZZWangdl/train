package day05.home;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写测试类  Company company = new Company();   添加员工  显示  删除  显示  排序  显示
 */
public class CompanyTest {
    public static void main(String[] args) {
        System.out.println(new Employee().name);

        Company com = new Company();
     /*   Employee e = new Employee("zhangsan", 25, 7644.3);
        com.addEmployee(e);
        com.addEmployee(new Employee("laoba", 55, 1634.67));
        com.addEmployee(new Employee("zhaoliu", 24, 6244.4));
        com.addEmployee(new Employee("wangwu", 30, 4344.7));
        com.addEmployee(new Employee("lisi", 28, 5544.3));*/
//以上是因为compare方法无法对于中文字符排序 所以替换为字母
        Employee e = new Employee("张三", 25, 7644.3);
        com.addEmployee(e);
        com.addEmployee(new Employee("阿里巴巴", 55, 1634.67));
        com.addEmployee(new Employee("赵六", 24, 6244.4));
        com.addEmployee(new Employee("王五", 30, 4344.7));
        com.addEmployee(new Employee("李四", 28, 5544.3));
        com.print();
        System.out.println("----------------------------排序后");
        //以上中文字符排序通过查找方法进行  Comparator<Object> com = Collator.getInstance(java.util.Locale.CHINA);
      /*  com.delete("张三");
        com.print();*/

      /*  com.sortAge();
        com.print();
      */  com.sortName();
        com.print();
    }

}
