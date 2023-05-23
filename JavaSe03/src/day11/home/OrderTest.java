package day11.home;

public class OrderTest {
    public static void main(String[] args) {
            Thread t1 = new Thread(()->{
                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("B");
                    }
                });
                t2.start();
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("C");
            });
            t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
