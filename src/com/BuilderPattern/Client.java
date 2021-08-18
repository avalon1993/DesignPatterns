package com.BuilderPattern;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
//        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
//        benz.setSequence(sequence);
//        benz.run();


        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();


        Director director = new Director();
        for (int i = 0; i < 10; i++) {
            director.getABenzModel().run();
            System.out.println("------------");
            director.getBBenzModel().run();
        }


    }

}
