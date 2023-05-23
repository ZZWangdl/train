package day01;

public class Work02 {
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

    /*    double a=10/3.0;
        System.out.println(a);
        int aa=257;
        byte aaa=(byte)aa;
        System.out.println(aaa);aaa*/
    }
}
