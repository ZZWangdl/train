package day12.home;

public class Test {
    public static void main(String[] args) {

    Check cl = new Check("北京",34);
        for (int i = 1; i <38 ; i++) {
            new Person("小"+i+"",cl).start();
        }

    }

}
