package day02.test;

/**
 * 吃接口测试类
 */
public class EatTest {
    public static void main(String[] args) {
        Eatable a = new Dog();
        a.eat();
        Eatable v = new Eatable() {
            @Override
            public String eat() {
                System.out.println("esfesf");
                return "null";
            }
        };
    }
}
