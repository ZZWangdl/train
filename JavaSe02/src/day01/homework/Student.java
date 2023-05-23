package day01.homework;

/**
 * 2.假如一个学校包含若干个学生，使用面向对象编写思想完成如下功能
 * 实现添加3个学生
 * 实现输出所有的学生信息
 * 实现查找姓名为张三的学生是否存在
 * 实现删除李四的学生
 */
public class Student {
    private String name;
    private String num;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public Student() {
    }

    /**
     * 查找姓名为name的学生
     * @param students
     * @return
     */
    public static boolean search(Student[] students,String name){
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i].name)) {
                return true;
            }
        }
        return false;
    }
    public  static void print(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println("姓名："+students[i].name+"学号："+students[i].num);

        }
    }
}
