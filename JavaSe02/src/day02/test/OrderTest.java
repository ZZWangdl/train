package day02.test;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new Order("002","网上交易","笔记本","2021-06-30",1,6400.99,6400.99,true);
        o1.setNo("004");
        o1.setType("线下实体店");
        o1.setName("衣服");
        o1.setDate("2022-07-02");
        o1.setQuantity(3);
        o1.setprice(200);
        o1.setTotal(3*200);
        o1.setState(true);
        System.out.println("商品编号:"+o1.getNo() +"商品类型:"+ o1.getType() + "商品名称:"+o1.getName() + "下单日期:"+o1.getDate() + "商品数量:"+o1.getQuantity() + "商品单价:"+o1.getPrice() + "商品总价:" + o1.getTotal() + "交易状态:"+o1.getState());
    }
}
