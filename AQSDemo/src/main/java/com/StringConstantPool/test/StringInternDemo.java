package com.StringConstantPool.test;

public class StringInternDemo {
    public static void main(String[] args) {

        String str1 = new StringBuilder("58").append("tongcheng").toString();
        System.out.println(str1);
        System.out.println(str1.intern());
        System.out.println(str1 == str1.intern());

        System.out.println();



        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2);
        System.out.println(str2.intern());
        System.out.println(str2 == str2.intern());

    }

    /**
     *
     * 只有是java时是false
     *
     * 58tongcheng
     * 58tongcheng
     * true
     *
     * java
     * java
     * false
     */
}
