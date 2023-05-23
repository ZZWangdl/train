package day02.homework;

/**
 * 定义一个“怪兽”类
 * 属性包括：名字、血量
 * 将属性私有化，对外提供公开的set和get方法。
 * 提供两个构造方法：无参数构造方法，全参数构造方法。
 * 默认创建的怪兽，血量为10000cc
 * 对外提供一个掉血的方法，武器每攻击一次怪兽，怪兽掉血1000cc
 * 对外提供一个方法，可以输出怪兽当前的血量。
 */
public class Monster {
    private String name;


    /**
     * 输出怪兽血量
     */
    public String print() {
        return name+"的初始血量为"+blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {

        this.blood = blood;
    }

    public Monster(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Monster() {
        blood = 10000;

    }

    /**
     * 怪兽掉血
     */
    public void bleeding() {
        if (blood < 0) {
            System.out.println("怪兽血量为0");
            return;
        }
        blood -= 1000;
        System.out.println(print());
    }


    private int blood;
}
