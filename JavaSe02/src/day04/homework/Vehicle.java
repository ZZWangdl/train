package day04.homework;

public class Vehicle {
    private double speed;
    private String type;
    private String name;
/*3.请定义一个交通工具(Vehicle)的类，其中有:
    属性：速度(speed)，车的类型(type)等等
    方法：移动(move())，设置速度(setSpeed(double s))，加速speedUp(double s),减速speedDown(double s)等等.
            最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过构造方法给它初始化speed,type的值，并且打印出来。
    另外，调用加速，减速的方法对速度进行改变。*/

    /**
     * 设置行驶方向
     */
    public void move(String dirction){
        System.out.println(name+"正在"+dirction);
    }

    /**
     * 设置初速度
     * @param s
     */
    public void setSpeed(double s){
            speed=s;
        System.out.println("当前车速为"+speed+"km/h");
    }

    /**
     * 加速
     * @param s
     */
    public void speedUp(double s){
            speed+=s;
        if (speed > 120) {
            System.out.println("您已超速，请减速");
        }
    }

    /**
     * 减速
     * @param s
     */
    public void speedDown(double s){
            speed-=s;
        if (speed < 0) {
            speed=0;
            System.out.println("车速为0");
        }
    }

    @Override
    public String toString() {
        return "一辆"+type+name+"正在以"+speed+"km/h的速度行驶";
    }

    public double getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(double speed, String type, String name) {
        this.speed = speed;
        this.type = type;
        this.name = name;
    }

    public Vehicle() {
    }
}
