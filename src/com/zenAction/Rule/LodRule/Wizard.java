package com.zenAction.Rule.LodRule;

import java.util.Random;

public class Wizard {

    private Random random = new Random(System.currentTimeMillis());

    private int first() {
        System.out.println("执行第一个方法。。。");
        return random.nextInt();
    }

    private int second() {
        System.out.println("执行第二个方法。。。");
        return random.nextInt();
    }

    private int third() {
        System.out.println("执行第三个方法。。。");
        return random.nextInt();
    }

    public void installWizard() {
        int first = this.first();
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();

                if (third > 50) {
                    first = this.first();
                }
            }
        }
    }


}
