package day11.test;
/**
 * 第三种方式 实现callable接口 创建FutureTask类参数为callable 创建线程对象thread 传递参数FutureTasl对象 开启线程
 */

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallTest implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("继承的线程===========" + i);
        }
        return null;
    }

    public static void main(String[] args) {
        CallTest c = new CallTest();
        FutureTask f = new FutureTask(c);
        Thread t = new Thread(f);
        t.start();
            for (int i = 0; i < 100; i++) {
                System.out.println("mian的线程===========" + i);
            }
    }
}
