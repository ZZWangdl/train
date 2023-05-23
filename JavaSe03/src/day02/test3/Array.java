package day02.test3;

public class Array {
    public static void main(String[] args) {
        String[] str = new String[]{"李四", "张三", "王五"};
        Student s1 = new Student(30);
        Student s2 = new Student(20);
        Student s3 = new Student(49);
        Student[] ste = new Student[]{s1, s2, s3};

        for (Student student : ste) {
           /* System.out.print("修改前:"+student.age);
            student.age=10;
            System.out.print("修改后:"+student.age);
*/
            if (55 == student.age) {
                System.out.println("存在");
                return;
            }
        }
        System.out.println("不存在");

    }
}
