package com.BuilderPattern;

public class BMWModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("宝马车启动是这样的。。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车是这样的。。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这样的。。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声音是这样的。。。。");
    }
}
