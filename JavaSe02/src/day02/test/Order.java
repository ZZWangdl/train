package day02.test;

/**
 * 订单类
 */
public class    Order {
    /**
     * 商品编号
     */
    private String no;
    /**
     * 交易方式
     */
    private String type;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 下单日期
     */
    private String date;
    /**
     * 数量
     */
    private int quantity;
    /**
     * 商品单价
     */
    private double price;
    /**
     * 总价
     */
    private double total;
    /**
     * 订单状态
     */
    private boolean state;

    /**
     * 无参构造方法
     */
    public Order() {

    }

    /**
     * 无参构造方法
     */
    public Order(String no, String type, String name, String date, int quantity, double price, double total, boolean state) {
        this.no = no;
        this.type = type;
        this.name = name;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.state = state;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setprice(double peice) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean getState() {
        return state;
    }


}
