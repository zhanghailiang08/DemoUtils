package com.design.factory;

public class APP {
    public static void main(String[] args) {
        FoodFactory foodFactory = new ChineseFoodFactory();

       Food food =  foodFactory.makeFood("A");
       food.toString();

    }
}
