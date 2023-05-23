package day01.homework;

import java.util.Random;
//1.随机产生100个小写字母并保存到字符数组中,
//        用该数组生成字符串,用String类的方法统计字母’c’出现的次数.

public class Homew01 {
    public static void main(String[] args) {
        Random random=new Random() ;
        String str="";
        for (int i = 0; i <100 ; i++) {
            char a=(char)(random.nextInt(26)+97);
            str+=a;
        };
        System.out.println("字符串"+str+"\n中字符c的个数为:"+count(str));

    }
    /**
     *
     * 判断字符串中c的个数
     *
     */

    private static int count(String str) {
        char cc='c';
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==cc){
                count++;
            }
        }
        return count;
    }
}
