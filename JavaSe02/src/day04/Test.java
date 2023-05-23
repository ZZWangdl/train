package day04;

import java.util.Objects;

public class Test {
    int x;
    String a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return x == test.x && Objects.equals(a, test.a);
    }

    //@Override
//    public int hashCode() {
//        return Objects.hash(x, a);
//    }

    public Test(int x, String a) {

        this.x = x;
        this.a = a;
    }

    public static void main(String[] args) {
        Test t1 = new Test(22,"www");
        Test t2 = new Test(22,"www");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
    public Test(String a) {
        this.a = a;
    }

    Test() {
        System.out.println("这是父类的构造方法");
    }
}
