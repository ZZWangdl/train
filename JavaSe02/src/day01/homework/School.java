package day01.homework;

public class School {
    private Student[] students;

    public School() {
        students = new Student[5];
    }

    public School(Student[] students) {

    }

    public static void main(String[] args) {
        School school = new School();
        Student st1 = new Student("张三", "1001");
        Student st2 = new Student("李四", "1002");
        Student st3 = new Student("王五", "1003");
        Student[] student1 = new Student[]{st1, st3, st2};
        System.out.println(Student.search(student1, "张三"));
        Student.print(student1);
        int[] a = {2, 2, 4};

    }
}
