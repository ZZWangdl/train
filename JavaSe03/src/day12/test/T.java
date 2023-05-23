package day12.test;

public class T {
    public static void main(String[] args) {
        SubThread t = new SubThread();
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main ---> " + i);
        }
        t.flag = false;
    }

    private static class SubThread extends Thread {
        boolean flag = true;
        //volatile boolean flag = true;         //volatile能保证数据的可见性

        @Override
        public void run() {
            while (flag) {

            }
            System.out.println("flag标志改为false之后, 上面的循环结束了");
        }
    }
}
