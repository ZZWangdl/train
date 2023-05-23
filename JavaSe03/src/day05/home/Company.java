package day05.home;

import day05.test.Student;

import java.text.Collator;
import java.util.*;

/**
 * 定义Company公司类, 公司有若干员工, 定义List集合存储员工信息  提供方法添加员工  提供方法删除指定姓名的员工  提供方法显示所有员工  提供方法根据年龄升序排序  提供方法,根据姓名降序排序
 */
public class Company {
    private List<Employee> list;

    public Company(List<Employee> list) {
        this.list = list;
    }

    public Company() {
        list = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Company{" +
                "list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(list, company.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    /**
     * 按照员工年龄进行升序
     */
    public void sortAge() {
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.age - o2.age;
            }
        });

    }
    /**
     * 按照员工名字进行降序
     */
    public void sortName() {
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Comparator<Object> com = Collator.getInstance(java.util.Locale.CHINA);
                return com.compare(o2.name, o1.name);
            }
        });

    }
    /**
     * 删除指定的员工
     */
    public void delete(String name) {
        Iterator<Employee> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Employee emp1 = it.next();
            if (name.equals(emp1.name)) {
                it.remove();
                i++;
            }
        }
        if (i == 0) {
            System.out.println("公司没有这个员工");
        } else {
            System.out.println("已经删除了");
        }
    }

    /**
     * 添加员工方法
     *
     * @param
     * @param e
     */
    public void addEmployee(Employee e) {
        list.add(e);
    }

    /**
     * 打印所有员工信息
     *
     * @param
     */
    public void print() {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }


}
