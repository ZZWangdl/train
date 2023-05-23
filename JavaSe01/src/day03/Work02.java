package day03;

public class Work02 {
                //2)1~10之间的整数相加，得到累加值大于20的当前数
                public static void main(String[] args) {
                    int sum=0;
                    int i=1;
                    for (; i <=19 ; i++) {
                        sum+=i;
                        if (sum > 20) {
                            break;
                        }
                    }
                    System.out.println("sum的值为"+sum+",此时整数的值为"+i);
                }
}
