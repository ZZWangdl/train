package day11.test;

/**
 * 第二种方式  实现Runnable接口  创建Thread对象传递 Runnable 接口实现类
 */
public class RunnTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("继承的线程===========" + i);
        }
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        Thread t = new Thread(test);
        Thread t2 = new Thread(()->{
        });

        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main方法的线程===========" + i);
        }
    }
}
