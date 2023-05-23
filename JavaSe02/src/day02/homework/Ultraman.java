package day02.homework;

/**
 *

 *
 ** 定义一个“奥特曼”类
 * 	 属性包括：名字
 * 	 将属性私有化，对外提供公开的set和get方法。
 * 	 提供两个构造方法：无参数构造方法，全参数构造方法。
 * 	 对外提供一个攻击的方法，例如：
 * 		public class 奥特曼{
 * 			public void attack(怪兽 guaiShou){
 * 		*/
public class Ultraman {
    private  String name;

    public Ultraman() {
    }

    public void attack(Monster monster){
        System.out.println(name+"向怪兽"+monster.getName()+"发射了哉佩利敖光线");
            monster.bleeding();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ultraman(String name) {
        this.name = name;
    }
}
