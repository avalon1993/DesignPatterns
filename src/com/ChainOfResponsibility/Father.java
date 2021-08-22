package com.ChainOfResponsibility;

public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

//    @Override
//    public void HandleMessage(IWomen women) {
//        System.out.println("女儿的请示是：" + women.getRequest());
//        System.out.println("父亲的答复是：同意");
//    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------------------女儿向父亲请示--------------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
