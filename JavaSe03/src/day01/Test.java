package day01;

public class Test extends AbstractTest{
    public static void main(String[] args) {
        Test t = new Test();
        t.a=333;
        System.out.println(t.a);
        System.out.println(new Test().a);
    }
}
