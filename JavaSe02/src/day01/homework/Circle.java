package day01.homework;

/**
 * 定义圆形类：Circle
 * 		圆形类的属性：半径
 *
 */
public class Circle {
    double radius;


    /**
     *
     * 有限循环小数乘整数不分先后结果相同
     */
    public static void main(String[] args) {
        System.out.println(3.1415926*5*5);
        System.out.println(3.1415926*25);
    }

    /**
     * 提供set get方法给外部调用
     * @param setRadius
     */
    public void setRadius(double radius){
            this.radius=radius;
    }
    public double setRadius(){
        return  radius;

    }

}
