package com.AQS.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AQSDemo {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        //带入一个银行办理业务的案例来模拟我们的AQs 如何进行线程的管理和通知唤醒机制
        //3个线程模拟3个来银行网点，受理窗口办理业务的顾客

        //A顾客就是第一个顾客，此时受理窗口没有任何人，A可以直接去办理
        new Thread(()->{
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " come in.");

                try {
                    TimeUnit.SECONDS.sleep(5);//模拟办理业务时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                lock.unlock();
            }
        }, "Thread A").start();

        //第2个顾客，第2个线程---->，由于受理业务的窗口只有一个(只能一个线程持有锁)，此代B只能等待，
        //进入候客区
        new Thread(()->{
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " come in.");

            } finally {
                lock.unlock();
            }
        }, "Thread B").start();


        //第3个顾客，第3个线程---->，由于受理业务的窗口只有一个(只能一个线程持有锁)，此代C只能等待，
        //进入候客区
        new Thread(()->{
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " come in.");

            } finally {
                lock.unlock();
            }
        }, "Thread C").start();
    }
}


