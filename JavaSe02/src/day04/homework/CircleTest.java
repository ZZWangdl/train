package day04.homework;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("圆的面积为："+c.area());
        System.out.println("圆的周长为："+c.perimeter());
        c.setR(33);
        System.out.println("圆的面积为："+c.area());
        System.out.println("圆的周长为："+c.perimeter());
    }
}
