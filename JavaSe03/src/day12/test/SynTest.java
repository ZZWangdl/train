package day12.test;

import sun.awt.Win32ColorModel24;

public class SynTest {
    public static void main(String[] args) throws InterruptedException {
        SynTest test = new SynTest();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynTest.m1();
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               SynTest.m1();
            }
        });
        t2.start();
    }

     static synchronized void m1() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"=============="+i);
        }
    }


}
