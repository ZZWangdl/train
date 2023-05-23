package day08.test;

/**
 * 泛型测试
 */
public class GenericTest<T> {
    public static void main(String[] args) {
        Integer[] num = {11, 2, 44};
        GenericTest te = new GenericTest();
        te.adds(num);
        Student[] students = {new Student(), new Student()};
        te.adds(students);
    }


    public <T> void adds(T[] a) {
        for (T t : a) {
            System.out.println(t);
        }
    }
}

