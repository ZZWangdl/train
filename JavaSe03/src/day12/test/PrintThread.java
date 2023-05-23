package day12.test;

public class PrintThread {
        static final Object obj = new Object();
        static int i =1;

        public static void main(String[] args) {
            for (int j = 1; j <4 ; j++) {
                final  int k =j;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        PrintThread.print(k);
                    }
                }).start();
            }


        }
   public static void print(int k){
       for (int j = 0 ;j <3; j++) {
           System.out.println(Thread.activeCount());
           synchronized (obj) {
               while (i % 3 == k) {
                   System.out.println(k);
                   i++;
                   try {
                       obj.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               obj.notifyAll();
           }
       }
    }
}
