package day02.test2;

import day02.test3.DeleteElement;

public class Test {
    int x = 22;
//成员内部类就是一个成员变量可以被成员变量和实例方法去调用 就是调用是需要的是new对象而已这个实例变量就是一个类对象而已(与成员变量是是一个引用是有异曲同工的之处)
    void m() {
        new T().m();
    }
    //静态方法不能直接使用实例变量
    static void a() {
        System.out.println(new Test().x);
    }

    class T {
        int y = 33;

        public void m() {
            System.out.println("成员内部类当中的方法");
        }
    }

    public static void main(String[] args) {
        DeleteElement aa = new DeleteElement();
        Test test = new Test();
        T a = test.new T();
        System.out.println(test.new T().y);
        System.out.println("这是调用成员内部类的方法");

    }
}
