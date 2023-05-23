package day02.home;

/**
 * 1 定义存储100个char字符的数组, 给所有数组元素赋值随机的小写字符, 统计小写字母a出现的次数      java.lang包中有Math数学类, 该类提供静态方法random()生成 [ 0 ,1)范围内的随机小数     int  n = ( int )( Math.random() * 26 );    生成 [ 0 ,26)范围内的随机整数     char cc = (char)( 'a' + n );  可以把整数n转换为小写字母
 *
 */
public class Homework01 {
    public static void main(String[] args) {
        char[] chars = new char[100];
        int count=0;
        int count1=0;
        for (int i = 0; i <chars.length ; i++) {
            int a=(int)(Math.random()*26);
            chars[i]=(char)(a+'a');
            if (a == 0) {
                count++;
            }
            if (chars[i] =='a') {
                count1++;
            }

        }
            System.out.println();
        System.out.println("0的个数是:"+count);
        System.out.println("a的个数是:"+count1);
    }
}
