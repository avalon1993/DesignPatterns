package com.MediatorPattern;

public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    // 采购
    public void buyIBMcomputer(int number) {
//        Stock stock = new Stock();
//        Sale sale = new Sale();
//        int saleStatus = sale.getSaleStatus();
//
//        if (saleStatus > 80) {
//            System.out.println("采购IBM电脑：" + number + "台");
//            stock.increase(number);
//        } else {
//            int buyNumber = number / 2;
//            System.out.println("采购IBM电脑：" + buyNumber + "台");
//        }

        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不要采购IBM电脑！");
    }

}
