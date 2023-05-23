package day06;

public class Homework03 {
    //3)打印所有三位数的水仙花数
    public static void main(String[] args) {
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
