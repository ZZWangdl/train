package day01;

import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sca.nextInt();
        int m = 0, n = 0, l = 0;
        while (a < 0) {
            System.out.println("输入不合法，请重新输入整数");
            a = sca.nextInt();
            if (0<a&&a<1000) {
                break;
            }
        }
        m = a / 100;
        n = (a / 10) % 10;
        l = a % 10;
        if(a==(m*m*m+n*n*n+l*l*l)){
            System.out.println("该数是水仙花数");
        }else {
            System.out.println("该数不是水仙花数");
        }
        int mm = 0;
        System.out.println("1000以内的水仙花数有");
        for (int i = 1; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                for (int k = 0; k <10; k++) {
                    mm=i*100+j*10+k*1;
                    if (mm==(i*i*i+j*j*j+k*k*k)) {
                        System.out.print(mm+"、");
                    }
                }
            }
        }

    }
}
