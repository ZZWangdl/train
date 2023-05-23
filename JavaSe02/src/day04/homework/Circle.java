package day04.homework;

public class Circle {
    public static final double PI = 3.14;
    private double r;

    /**
     * 2.创建一个圆Circle类。为该类提供一个变量r表示半径，一个常量PI表示圆周率；同时为该类提供两个方法：方法一用于求圆的面积，方法二用于求圆的周长；为该类提供一个无参的构造方法，用于初始化r的值为4。
     *
     * @return
     */


    /**
     * 计算圆面积
     * @param c
     * @return
     */
    public double area(){
        return  r*r*PI;
    }

    /**
     *计算圆的周长
     */
    public  double perimeter(){
        return 2*PI*r;
    }



    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
        r=4;
    }

    public Circle(double r) {
        this.r = r;
    }
}
