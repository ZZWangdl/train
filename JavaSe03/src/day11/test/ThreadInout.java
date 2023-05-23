package day11.test;

public class ThreadInout {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {

                System.out.println(Thread.currentThread().getName()+"======="+Thread.interrupted()+Thread.currentThread().getPriority());
                }
            }
        });
        t.start();

        t.setName("run线程");
        Thread.currentThread().setName("main方法线程");
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println(t.getId());
        t.setPriority(10);
        t.interrupt();
    }
}
