package day04;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cc = new Cat();
        Animal a = new Cat();
        cc.move(a);
        a.move(cc);
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchmouse();
        }
    }
}
