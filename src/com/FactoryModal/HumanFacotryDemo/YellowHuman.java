package com.FactoryModal.HumanFacotryDemo;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双节字！");
    }
}
