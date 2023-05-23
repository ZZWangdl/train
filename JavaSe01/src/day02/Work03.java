package day02;

import java.util.Scanner;

public class Work03 {
    // 3、张三准备要去美国旅游，现在要订购机票。机票的价格受季节旺季、淡季影响，
//    而且头等舱和经济舱价格也不同。其中，4—10月为旺季，旺季头等舱打九折，经济舱打八折，
//    淡季头等舱打五折，经济舱打四折。
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("欢迎来到机票订购系统\n请输入您需要订购机票的日期（；例如八月十四日为8.14）");
        String s=scanner.next();
        System.out.println("头等舱请按1，经济舱请按2");
        int leixing= scanner.nextInt();
        String str[]=s.split("\\.");
        int a=Integer.parseInt(str[0]);
        int check=800;
        if (a<10&&a>4) {
            if (leixing==1) {
                check*=0.9;
                System.out.println("您预订的机票为旺季头等舱，价格为："+check);
            } else{
                check*=0.8;
                System.out.println("您预订的机票为旺季经济舱，价格为："+check);
            }
        }else{
            if (leixing==1) {
                check*=0.5;
                System.out.println("您预订的机票为淡季头等舱，价格为："+check);
            } else{
                check*=0.4;
                System.out.println("您预订的机票为淡季经济舱，价格为："+check);
            }
        }


        //System.out.println(Integer.parseInt(s));
    }
}
