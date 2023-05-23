package day04.homework;

public class PlainRect extends Rect {
    /**
     * 坐标X轴
     */
    double startX;
    /**
     * 坐标Y轴
     */
    double startY;

    public PlainRect(double width, double heigth, double startX, double startY) {
        super(width, heigth);
        this.startX = startX;
        this.startY = startY;
    }

    public PlainRect() {
        this(0, 0, 0, 0);
    }

    /**
     * 判断给定点是否在矩形内
     * @param x
     * @param y
     * @return
     */
    public boolean isInside(double x, double y) {
        if (x >= startX && x <= (startX + width) && y < startY && y >= (startY - height)) {
            return true;
        }
        return false;
    }
}
