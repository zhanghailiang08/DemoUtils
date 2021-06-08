package com.design.simpleFactory;

public class Cook {

    public static void main(String[] args) {
        Food food = FoodFactory.makeFood("黄焖鸡");
        FoodFactory.makeFood("jiajia");


    }
}
