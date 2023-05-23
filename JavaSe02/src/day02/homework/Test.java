package day02.homework;

public class Test {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.setName("哥尔赞");
        Ultraman atm = new Ultraman("迪迦奥特曼");
        System.out.println(monster.print());
        atm.attack(monster);
    }
}
