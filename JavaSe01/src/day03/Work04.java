package day03;

import java.util.Random;
import java.util.Scanner;

public class Work04 {
    /* 4)猜数游戏，生成一个[0，100)之间的随机整数，提示用户输入猜测的数字
     ，如果不相等提示用户大了还是小了，输出用户共猜测了多少次。*/
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int guess = 100;
        int total=0;
        while (guess != a) {
            System.out.println("猜一猜是多少（是[0，100)之间的随机整数哦）");
            guess = scanner.nextInt();
            if (guess < a) {
                System.out.println("猜小了，可以大一点呦");
            } else if (guess > a) {
                System.out.println("猜大了，可以小一点呦");
            }
            total++;
        }
             System.out.println("恭喜你！！猜对了。\n你一共猜了"+total+"次");
    }
}
