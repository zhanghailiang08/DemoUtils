package com.AQS.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AQSDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        //带入一个银行办理业务的案例来模拟我们的AQS如何进行线程管理和通知唤醒机制
        //3个线程模拟3个银行网点，受理窗口办理业务的顾客
        new Thread(()->{
            reentrantLock.lock();
            try {
                System.out.println("---A come in");
                TimeUnit.SECONDS.sleep(10);
            }catch (Exception e){

            }finally {
                reentrantLock.unlock();
            }
        });


    }
}
