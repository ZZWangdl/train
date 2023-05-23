package day04;

public class Homework03 {
    public static void main(String[] args) {
        //3、计算1到100之间，既能被3整除又能被5整除的数，输出FlipFlop；
        //只能被3整除的数，输出Flip；只能被5整除的数，输出Flop；否则输出当前数。
        for (int i = 0; i <100 ; i++) {
            if (i%3 ==0) {
                System.out.println("Flip");
                if (i%5 ==0) {
                    System.out.println("FlipFlop");
                }
            }
            if (i%5 ==0) {
                System.out.println("Flop");
            }
        }
    }
}
