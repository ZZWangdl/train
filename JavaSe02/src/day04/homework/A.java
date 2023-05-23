package day04.homework;

/*
1.猜数字游戏：一个类A有两个实例变量v、num。、num。定义一个方法guess，v是被猜测的数字，num是猜测的数字。如果大了则提示大了，小了则提示小了。等于则提示猜测成功。
*/
public class A {
    private int v = 55;

    public A(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    public void guess(int num) {
        if (num > v) {
            System.out.println("猜大了");
        } else if (num < v) {
            System.out.println("猜小了");
        }else if (num==v){
            System.out.println("猜对了");
        }
    }
}
