package com.CommandPattern;

public class Client {

    public static void main(String[] args) {
//        System.out.println("-----------------客户要求增加一项需求------------------");
//
//        Group rg = new RequirementGroup();
//        rg.find();
//        rg.add();
//        rg.plan();


        Invoker xiaosan = new Invoker();
        System.out.println("-----------------客户要求增加一项需求------------------");
        Command command = new AddRequirementCommand();

        xiaosan.setCommand(command);
        xiaosan.action();


    }
}
