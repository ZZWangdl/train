package day01;

public class InterfaceTest implements S{
    public static void main(String[] args) {
        InterfaceTest a = new InterfaceTest();
        System.out.println(a);
    }

    @Override
    public void m(S s)
    {
        System.out.println(a);
    }
}
