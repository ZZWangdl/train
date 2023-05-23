package day04.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DicimalTest {
    public static void main(String[] args) {
       // DecimalFormat def = new DecimalFormat("0000,0000.000");//这个字符串指定的是格式后面调用format传递的是数字会按照这个格式来输出
       // System.out.println(def.format(4645465.55));
        BigDecimal decimal = new BigDecimal("234567890232134567890989765434636722323534632462362345623456245654645645364373567356757567567756456789");
        //使用字符串构造方法来创建对象,
        // 其他对象存在精度不准或者保留近似值存储的方式可能导致数据存储是就会丢失精度那这个类的使用就没有意义
        BigDecimal decimal1 = new BigDecimal("234567890232134567890989765434636722323534632462362345623456245654645645364373567356757567567756456789");
        System.out.println(decimal.add(decimal1));
        System.out.println(decimal.subtract(decimal1));
        System.out.println(decimal.multiply(decimal1));
        System.out.println(decimal.divide(decimal1));//如果数据成为无线小数时就会报算术异常public class ArithmeticException extends
        // RuntimeException {

    }
}
