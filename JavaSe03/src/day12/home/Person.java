package day12.home;

public class Person extends Thread {
    public Person(String name, Check cl) {
        super(name);
        this.cl = cl;
    }

    Check cl;

    @Override
    public void run() {
        synchronized (cl) {
            System.out.println(Thread.currentThread().getName() + "买去往" + cl.name + "票的时候余票有" + cl.count);
            if (cl.count != 0) {
                buy(1);
            } else {
                System.out.println("今天没有票了,明天吧");
                return;
            }
            System.out.println(Thread.currentThread().getName() + "买完去往" + cl.name + "票的时候余票有" + cl.count);
        }
    }

    public void buy(int i) {
        cl.count -= i;
    }
}
