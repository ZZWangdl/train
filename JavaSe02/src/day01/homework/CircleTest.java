package day01.homework;

import java.util.Scanner;

public class CircleTest {
    Circle c=new Circle();
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Circle circle = new Circle();
        circle.radius = scanner.nextDouble();
        double radius1=circle.radius;
        area(radius1);
        System.out.println(new CircleTest().c.radius);
    }

    private static void area(double radius1) {
    }
}
