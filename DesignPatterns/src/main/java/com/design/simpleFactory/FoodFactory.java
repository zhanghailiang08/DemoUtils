package com.design.simpleFactory;

public class FoodFactory {
    public static Food makeFood(String name) {
        if (name.equals("兰州拉面")) {
            Food noodle = new LanZhouNoodle();
            System.out.println("兰州拉面"+noodle+"出锅啦");
            return noodle;
        } else if (name.equals("黄焖鸡")) {
            Food chicken = new HuangMenChicken();
            System.out.println("黄焖鸡"+ chicken +"出锅啦");
            return chicken;
        } else {
            System.out.println("不知道你做的什么哦~");
            return null;
        }
    }


}
