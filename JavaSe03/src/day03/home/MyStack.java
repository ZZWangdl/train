package day03.home;

public class MyStack {
    Object obj[];
    private int maxSize;
    private int index;

    MyStack(int maxSize) {
        this.maxSize = maxSize;
        obj = new Object[maxSize];
        index = -1;
    }

    public void push(Object object) {
        if (index == maxSize - 1) {
            throw new MyException("栈已满,放不下了");
        }
        obj[index + 1] = object;
        index++;
    }

    public void pop() {
        if (index < 0) {
            throw new MyException("栈已空,没有东西了");
        }
        obj[index] = null;
        index--;
    }

    public void print() {
        if (index < 0) {
            throw new MyException("栈空了, 给你打印空气?");

        }
        for (int i = 0; i <= index; i++) {
            System.out.print(" " + obj[i]);
        }
        System.out.println();

    }
}
