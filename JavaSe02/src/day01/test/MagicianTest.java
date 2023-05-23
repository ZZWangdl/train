package day01.test;

public class MagicianTest {
    public static void main(String[] args) {
        Magician magic1 = new Magician();
        magic1.name = "炽阳大法师";
        magic1.blood = 2000;
        magic1.defend = 50;
        magic1.mp = 300;
        magic1.skill = "炽阳法咒";
        magic1.type = "远程法师";
        System.out.println("名字 :" + magic1.name);
        System.out.println("血量 :" + magic1.blood);
        System.out.println("蓝条 :" + magic1.mp);
        System.out.println("技能是：" + magic1.skill);
        System.out.println("类型：" + magic1.type);
        Magician magic2 = new Magician();
        magic2.name = "老六";
        magic2.blood = 3000;
        magic2.mp = 0;
        magic2.defend = 0;
        magic2.skill = "猛男波波拳";
        magic2.type = "近战法师";
        System.out.println("名字 :" + magic2.name);
        System.out.println("血量 :" + magic2.blood);
        System.out.println("蓝条 :" + magic2.mp);
        System.out.println("技能是：" + magic2.skill);
        System.out.println("类型：" + magic2.type);
    }
}
