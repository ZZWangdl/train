package day04.homework;

public class Rect {
    /**
     * 矩形长
     */
    protected double width;
    /**
     * 矩形宽
     */
    protected double height;

    public Rect() {
        this(10, 10);
    }

    public Rect(double width, double heigth) {
        this.width = width;
        this.height = heigth;
    }

    /**
     * 计算矩形的面积
     * @return
     */
    public double area() {
        return width * height;
    }

    /**
     * 计算矩形的周长
     * @return
     */
    public double perimeter() {
        return 2 * (width + height);
    }
}
