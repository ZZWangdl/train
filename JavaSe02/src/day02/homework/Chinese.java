package day02.homework;

/**
 * * 定义一个“中国人”类
 * * 属性包括：身份证号、姓名、年龄、性别、国籍（注意哪些变量定义为实例变量，哪些变量定义为静态变量）
 * * 将需要的属性私有化，对外提供set和get方法
 * * 提供两个构造方法：无参数构造方法，全参数构造方法。
 * * 编写测试类：
 * - 创建中国人对象
 * - 打印该对象的信息
 */
public class Chinese {
    //姓名
    private String name;
    //身份证号
    private String id;
    //年龄
    private int age;
    //性别
    private boolean gender;
    //国籍
    static String nation = "中国";


    //打印中国人的信息
    public void print() {
        System.out.println("姓名；" + name + "性别：" + gender + "年龄" + age + " 身份证号：" + id + "国籍" + nation);
    }

    public Chinese(String name, String id, int age, boolean gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public Chinese() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


}
