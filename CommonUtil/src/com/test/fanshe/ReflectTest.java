package com.test.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 操作目标类的元信息
 */
public class ReflectTest {
    public static Car car;
    public static Car initByDefaultConst() throws Throwable {


        //通过类加载器获取car对象
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class classs = classLoader.loadClass("com.test.fanshe.Car");

        //获取类的默认构造器对象并通过他实例化car
        Constructor constructor = classs.getDeclaredConstructor((Class[]) null);
        car = (Car) constructor.newInstance();

        //通过反射方法设置属性
        Method setBrand = classs.getMethod("setBrand",String.class);
        setBrand.invoke(car,"红旗");
        Method setColor = classs.getMethod("setColor",String.class);
        setColor.invoke(car,"黑色");
        Method setMaxSpeed = classs.getMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,100);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }
}
