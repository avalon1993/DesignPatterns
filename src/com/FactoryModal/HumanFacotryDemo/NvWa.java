package com.FactoryModal.HumanFacotryDemo;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory YingYangLu = new HumanFactory();

        System.out.println("--造成第一批人是白色人种--");
        Human whiteMan = YingYangLu.createHuman(WhiteHuman.class);
        whiteMan.getColor();
        whiteMan.talk();

        System.out.println("--造成第二批人是黑色人种--");
        Human blackMan = YingYangLu.createHuman(BlackHuman.class);
        blackMan.getColor();
        blackMan.talk();

        System.out.println("--造成第三批人是黄色人种--");
        Human yellowMan = YingYangLu.createHuman(YellowHuman.class);
        yellowMan.getColor();
        yellowMan.talk();
    }
}
