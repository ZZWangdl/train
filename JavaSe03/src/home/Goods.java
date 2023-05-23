package home;

import java.util.Objects;

public class Goods {
    private int id;
    private int count;
    private String name;
    private double price;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods(int id, int count, String name, double price) {
        this.id = id;
        this.count = count;
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods goods = (Goods) o;
        return id == goods.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count, name, price);
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
