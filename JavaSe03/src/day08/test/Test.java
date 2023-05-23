package day08.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int n =12;
        List<Student> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <n ; i++) {
            Student student = new Student();
            int age =random.nextInt(10)+10;

            student.setAge(age);
            student.setId(i);

        //    name="";

            list.add(new Student(i,appenStr(),age));

        }

       list.stream().filter(student -> student.age<15).sorted((stu1,stu2)->
               {
                   if (stu1.age == stu2.age) {
                       return stu1.name.compareTo(stu2.name);
                   }
                   return stu1.age- stu2.age;
               }
               ).forEach(student -> System.out.println(student));
    }

    private static String appenStr() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();
        int total =random.nextInt(5)+5;
        while (total>0){
            int totals = random.nextInt(26)+'a';
            name.append((char)totals );
            total--;
        }
        String names = new String(name);
          return  names;
    }
}
