package day12.test;

public class SynchronizedTeset {
    static final Object obj = new Object();
    static int i =1;

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0 ;j <10; j++) {
                    synchronized (obj) {
                        while (i % 3 != 1) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println("A");
                        i++;
                            obj.notifyAll();
                    }


                }
            }
        }, "t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0 ;j <10; j++) {
                    synchronized (obj) {
                        while (i % 3 != 2) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        }
                        System.out.println("B");
                        i++;
                        obj.notifyAll();
                    }
                }
            }
        }, "t2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0 ;j <10; j++) {
                    synchronized (obj) {
                        while (i % 3!= 0) {

                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        }
                        System.out.println("C");
                        i++;
                            obj.notifyAll();
                    }
                }
            }
        }, "t3").start();

    }
}
