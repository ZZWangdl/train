package day02.test;

public class Dog implements Eatable{
    @Override
    public String eat() {
        System.out.println("狗狗吃骨头");
        return "222";
    }
}
