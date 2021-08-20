package com.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyClient {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");


        InvocationHandler handler = new GamePlayIH(player);

        System.out.println("开始时间：" + System.currentTimeMillis());
        ClassLoader cl = player.getClass().getClassLoader();

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：" + System.currentTimeMillis());
    }
}
