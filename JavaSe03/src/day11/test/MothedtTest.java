package day11.test;

public class MothedtTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(MothedtTest.class.getClassLoader());
        Thread[] t = new Thread[Thread.activeCount()];//获取当前活动的线程的数量
        Thread.enumerate(t);//将当前活动线程加入到数组
        /*for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);

        }*/
        for (Thread thread : t) {
            System.out.println(thread);
        }
    }
}
