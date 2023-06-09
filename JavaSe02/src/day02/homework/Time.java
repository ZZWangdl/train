package day02.homework;

/**
 * 时间类
 * * 属性包括：年、月、日
 * * 将属性私有化，对外提供公开的set和get方法。
 * * 提供两个构造方法：无参数构造方法，全参数构造方法。
 * * 默认创建的日期要求是：1970年1月1日
 */
public class Time {
    private int year;
    private int month;
    private int day;

    public Time(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }

    public Time() {
        this(1970, 1, 1);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
