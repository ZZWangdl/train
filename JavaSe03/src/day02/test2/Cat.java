package day02.test2;

public class Cat implements Running {
    @Override
    public void run() {
        System.out.println("猫会上蹿下跳");
    }

    public Running run2() {
            return new Cat();
    }
}
