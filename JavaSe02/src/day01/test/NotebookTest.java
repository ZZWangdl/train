package day01.test;

public class NotebookTest {
    public static void main(String[] args) {

        Notebook note=new Notebook();
        note.price=6488.9;
        note.brand="炫龙";
        note.color="黑色";
        note.type="笔记本";
        System.out.println("电脑的类型是"+note.type);
        System.out.println(note.type+"的价格为："+note.price);
        System.out.println(note.type+"的品牌是："+note.brand);
        System.out.println(note.type+"的颜色是："+note.color);
        System.out.println(note);
    }

}
