package com.FactoryModal.AbstractFactoryDemo;

public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色都是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }

}
