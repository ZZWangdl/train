package day12.test;

public class WhileTest {


    public static void main(String[] args) {
        A a = new A();
        a.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "=============" + i);
        }
        a.flag = false;

    }

 private    static class A extends Thread {
        boolean flag = true;

        @Override
        public void run() {
            while (flag) {
               // System.out.println(1);
                System.out.println(Thread.currentThread().getName() + "=============" );
                //大部分情况while有东西就能读到 没有东西就脏读,一直读不到更新之后的数据
            }
            System.out.println(1111111111);
        }
    }
}
