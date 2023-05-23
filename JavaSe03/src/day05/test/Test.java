package day05.test;

public class Test {
    public static void main(String[] args) {
 /*       Integer i1 = 456;
        Integer i2 = 456;//false
        System.out.println(i1==i2);
  */
        /*Integer i1 = 45;
        Integer i2 = 45;
        System.out.println(i1 == i2);//true
        */

        Integer i1 = new Integer(12);
        Integer i4 = 12;
        Integer i2 = new Integer(12);
        Integer i3 = Integer.valueOf(12);
        System.out.println(i1==i2);//false
        System.out.println(i1==i3);//false
        System.out.println(i4==i3);//true


    }
}
