package day02.test2;

public class RunTest {
    public static void main(String[] args) {
        Running run1 = new Cat();
        run1.run();
        Cat c= (Cat) run1;
        c.run2().run();
        Running run2 = new Running() {
            @Override
            public void run() {
                System.out.println("汽车也能跑");
            }
        };
        run2.run();
    }
}
