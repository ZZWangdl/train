package day07.home;

import java.util.Objects;

public class Pokers {
    String name;
    int value;

    public Pokers(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public Pokers() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokers)) return false;
        Pokers pokers = (Pokers) o;
        return value == pokers.value && Objects.equals(name, pokers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Pokers{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public void ass() {
         String str=name;
        if (!("大王".equals(name)||"小王".equals(name))) {
           str = name.substring(1);
        }
        switch (str) {
            case "大王":
                value = 100;
                break;
            case "小王":
                value = 50;
                break;
            case "2":
                value = 25;
                break;
            case "A":
                value = 20;
                break;
            case "K":
                value = 19;
                break;
            case "Q":
                value = 18;
                break;
            case "J":
                value = 17;
                break;
            default:
                value = Integer.parseInt(str);
                break;
        }
    }
        }
