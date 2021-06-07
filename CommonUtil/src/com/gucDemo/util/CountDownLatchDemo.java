package com.gucDemo.util;


import com.enumdemo.util.CountryEnum;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <=6 ; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" 被灭");
                countDownLatch.countDown();
            }, CountryEnum.forEach_Country(i).getRetMessage()).start();
        }
        countDownLatch.await(1, TimeUnit.SECONDS);
        System.out.println(Thread.currentThread().getName()+" 中国统一全球");
    }
}
