package day04.homework;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle tsl=new Vehicle(30,"电动","特斯拉");
        System.out.println(tsl);
        tsl.move("直行");
        tsl.speedUp(100);
        tsl.speedDown(200);
    }
}
