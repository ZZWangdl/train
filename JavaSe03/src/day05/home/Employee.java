package day05.home;

/**
 * 定义Employee员工类, 有姓名, 年龄, 工资等属性
 */
public class Employee {
    String name;
    int age;
    double sarlar;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sarlar=" + sarlar +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, int age, double sarlar) {
        this.name = name;
        this.age = age;
        this.sarlar = sarlar;
    }
}
