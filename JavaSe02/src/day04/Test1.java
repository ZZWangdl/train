package day04;

import java.util.Date;

public class Test1 extends Test{
    String name;
    int x=33;
    int y=2;
    public static void main(String[] args) {
        Test1 t = new Test1("张三");
        System.out.println("这是子类中的实例变量X="+t.x);
        t.getSuperX();
        System.out.println(new Date().getTime());
    }
    Test1(){
        //子类的无参构造方法执行时会默认调用父类的无参构造方法
        System.out.println("这是子类的构造方法");
    }
    public void getSuperX(){
        System.out.println("只是父类中的变量x="+super.x);
    }

    public Test1( String name) {
        this.name = name;
    }
}
