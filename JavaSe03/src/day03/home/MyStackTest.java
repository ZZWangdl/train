package day03.home;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(55);
        stack.push("张三");
        stack.push("北京大兴区");
        stack.push(true);
        stack.push("打工人");
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();

    }
}
