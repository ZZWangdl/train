package day01;

public class Demo {
    /* public static boolean foo(char c) {
         System.out.print(c);
         return true;
     }

     public static void main(String[] args) {
         int i = 0;
         for (foo('A'); foo('B') && (i < 2); foo('C')) {
             i++;// 1 2
             foo('D');
         }*/
    //ABDCBDC

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int i = 0;
        change(i);
        i = i++;
        int a = i++;

        System.out.println("i = " + i);
        System.out.println(i);
        System.out.println(3453);
    }

    public static void change(int i) {
        i++;
    }
}

