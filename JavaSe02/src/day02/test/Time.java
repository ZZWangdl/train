package day02.test;

public class Time {
    static int a =222;
    int year;
    int m;
    int h;
    int s;

    @Override
    public String toString() {
        return "Time{" +
                "year=" + year +
                ", m=" + m +
                ", h=" + h +
                ", s=" + s +
                '}';
    }

    public Time(int year, int m, int h, int s) {
        this.year = year;
        this.m = m;
        this.h = h;
        this.s = s;
    }

    public  Time(){
        this(1970, 1, 1, 0);
        System.out.println(new Time(1970, 1, 1, 0));
    }
}
