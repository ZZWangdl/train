package day01.test;

public class Notebook {
    public String brand;
    public double price;
    public String color;
    public String type;

    @Override
    public String toString() {
        return type+"的价格为："+price+" 品牌是："+brand+" 颜色是："+color;
    }
}
