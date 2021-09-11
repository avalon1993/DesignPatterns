package com.ObserverPattern;

public class LiSi implements ILiSi, Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板");

    }

    private void reportToQingshihuang(String reportContext) {
        System.out.println("李斯：报告大王！！观察到韩非子活动： " + reportContext);
    }

}

