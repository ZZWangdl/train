package day08;

public class Test {
    public static void main(String[] args) {
        String a="a";
        String b=a+"a";
        String d="a"+"a";
        String c="aa";
        //a(100,200);
        System.out.println(b==c);
        System.out.println(c==d);
        System.out.println(b==d);

        int k=012;
        System.out.println(k);
        System.out.println(0x23);
    }

    public static void a(int a,double b) {

    }

    public static int  a(double a,int b) {
        return 0;
    }
}
