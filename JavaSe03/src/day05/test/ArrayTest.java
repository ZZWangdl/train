package day05.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        Collection<Student> stu = new ArrayList<>();
        String name="张三";
        stu.add(new Student("张三","男",22));
        stu.add(new Student("王麻子","男",24));
        stu.add(new Student("大梦","女",44));
        stu.add(new Student("小华","男",32));
        stu.add(new Student("小梦","女",22));
        stu.add(new Student("小明","男",22));
       /* sear(stu,name);
        delete(stu,name);*/
        System.out.println(stu);
    }

    private static void delete(Collection<Student> stu, String name) {
        Iterator<Student> it = stu.iterator();
        while (it.hasNext()){
            Student student =it.next();
            if ( name.equals(student.name) ) {
                it.remove();
            }
        }
    }

    static void sear(Collection<Student> stu,String name) {
         boolean flag =false;
         for (Student student : stu) {
                if (name.equals(student.name) ) {
                    flag=true;
                    break;
                }
            }
         System.out.println(flag?"存在":"不存在");
    }

}
