package com.ProxyPattern;

public class Client {

    public static void main(String[] args) {
//        IGamePlayer player = new GamePlayer("张三");

//        System.out.println("开始时间：" + System.currentTimeMillis());
//
//        player.login("zhangSan", "password");
//        player.killBoss();
//        player.upgrade();
//        System.out.println("结束时间：" + System.currentTimeMillis());

//        IGamePlayer proxy = new GamePlayerProxy(player);

//        IGamePlayer proxy = new GamePlayerProxy("张三");
//        System.out.println("开始时间：" + System.currentTimeMillis());
//        proxy.login("zhangsan", "password");
//        proxy.killBoss();
//        proxy.upgrade();
//
//        System.out.println("结束时间：" + System.currentTimeMillis());


        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间：" + System.currentTimeMillis());


        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：" + System.currentTimeMillis());



    }
}
