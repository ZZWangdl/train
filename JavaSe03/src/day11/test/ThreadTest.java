package day11.test;

import day04.home.T;

/**
 * 第一种 直接继承Thread类,创建对象 重写run方法
 */
public class ThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("继承的线程==========="+i);
        }
    }

    public static void main(String[] args) {
            Thread thread = new ThreadTest();
            thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("MAIN方法的线程==========="+i);
        }
    }

}
