package day12.test;

/**
 * 测试循环创建线程是有有顺序    无顺序 1 2 3 1 2 3 1 2 1 3 2 1 2 3 3 不知道怎么输出的要可以控制输出必须使用锁 wait 和notify方法
 */
public class T3 {
    public static void main(String[] args) {
        for (int i = 0;i<5;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print(1+" ");
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print(2+" ");
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print(3+" ");
           // System.out.println("===================");
                }
            }).start();
        }
    }
}
/**
 * 测试循环创建线程 就像同时启动一样 线程没有顺序
 */
class T22 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            final int a= i ;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(a);
                }
            }).start();
        }
    }

}