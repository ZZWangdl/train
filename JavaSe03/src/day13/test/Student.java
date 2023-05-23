package day13.test;

public class Student {
  static {
    System.out.println("静态代码块执行");
  }
  public String name;
private  Boolean gender;
  public Student() {
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", gender=" + gender +
            ", age=" + age +
            '}';
  }
public static void m(){
  System.out.println("只是一个测试反射机制对静态代码的调用");
}
  public int getAge() {

    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name) {
    this.name = name;
  }

  public int age;
 /* public String gender;
  public String aaa;*/
 public static void main(String[] args) {
    Student st = new Student();
   System.out.println(st==null);
 }
}
