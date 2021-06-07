package com.fansheDemo.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class PrivateCarReflect {
    public static void main(String[] args) throws Throwable {
        BlockingQueue a = new ArrayBlockingQueue<String>(3);

        System.out.println(   a.offer("a",5, TimeUnit.SECONDS));
        System.out.println(   a.offer("b",5, TimeUnit.SECONDS));
        System.out.println(   a.offer("c",5, TimeUnit.SECONDS));
        System.out.println(   a.offer("d",5, TimeUnit.SECONDS));
        System.out.println(a.poll(5,TimeUnit.SECONDS));
        System.out.println(a.poll(5,TimeUnit.SECONDS));
        System.out.println(a.poll(5,TimeUnit.SECONDS));
        System.out.println(a.poll(5,TimeUnit.SECONDS));


//        a.put("a");
//        a.put("b");
//        a.put("c");
//        System.out.println("+++++++++++++++++");
//        a.take();
//        a.put("d");
//
//        a.take();
//        a.take();
//        a.take();
      //  a.take();
//        BlockingQueue a = new ArrayBlockingQueue<String>(3);
//        System.out.println(a.offer("a"));
//        System.out.println(a.offer("b"));
//        System.out.println(a.offer("c"));
//        System.out.println(a.offer("d"));
//
//        System.out.println(a.poll());
//        System.out.println(a.poll());
//        System.out.println(a.poll());
//        System.out.println(a.poll());


//        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//        Class clazz = loader.loadClass("PrivateCar");
//        PrivateCar privateCar = (PrivateCar)clazz.newInstance();
//        Field colorFld = clazz.getDeclaredField("color");
//        colorFld.setAccessible(true);
//        colorFld.set(privateCar,"red ");
//        Method drimethod = clazz.getDeclaredMethod("drive",(Class [])null);
//        drimethod.setAccessible(true);
//        drimethod.invoke(privateCar,(Object[])null);
        //   BlockingQueue a = new ArrayBlockingQueue<String>(3);
//        System.out.println(a.add("a"));
//        System.out.println(a.add("b"));
//        System.out.println(a.add("v"));
//
//
//        System.out.println(a.element());
//        System.out.println( a.remove());
//        System.out.println( a.remove());
//        System.out.println( a.remove());
//        System.out.println( a.remove());
    }
}
