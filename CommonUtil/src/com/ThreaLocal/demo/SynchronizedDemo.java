package com.ThreaLocal.demo;

public class SynchronizedDemo {

    // 变量
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public static void main(String[] args) {
        SynchronizedDemo myDemo01 = new SynchronizedDemo();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (SynchronizedDemo.class) {
                    myDemo01.setContent(Thread.currentThread().getName() + "的数据");
                    System.out.println("-----------------------------------------");
                    System.out.println(Thread.currentThread().getName() + "\t  " + myDemo01.getContent());
                }
            }, String.valueOf(i)).start();
        }

        String pp = "123456789";
        System.out.println(pp.substring(0,pp.length()-1));
    }
}
