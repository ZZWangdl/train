package day02.test3;
/**
 * 测试局部内部类中访问外部变量
 */

import java.sql.SQLOutput;

public class Test {
    public void mm(){
        int x=2;
       // x=4;
        class Inner {
            int y = 4;

            public Inner(int y) {
                this.y = y;
            }
            public void m() {
                Inner i = new Inner(5);
                i.y=55;
                System.out.println(y);
                System.out.println(x);
            }

        }


       // x=45;
    }
}
