package day03;

public class Test2 {

    static {
        System.out.println("静态代码块执行");
    }

    {
        System.out.println("代码块执行");
    }
        public  Test2 test=new Test2();

    Test2(){
        System.out.println("Test2构造方法执行");
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
    }

    void m(){
        m();
    }
}
