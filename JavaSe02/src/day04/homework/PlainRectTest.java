package day04.homework;

public class PlainRectTest {
    public static void main(String[] args) {
        PlainRect p = new PlainRect(20,10,10,10);
        System.out.println(p.area());
        System.out.println(p.perimeter());
        System.out.println(p.isInside(25.5, 13)?"在矩形内":"不在矩形内");
    }
}
