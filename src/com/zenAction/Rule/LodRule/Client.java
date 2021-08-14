package com.zenAction.Rule.LodRule;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String args) {
//        Teacher teacher = new Teacher();
//        teacher.commond(new GroupLeader());


        List<Girl> girlList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            girlList.add(new Girl());
        }

        Teacher teacher = new Teacher();
        teacher.commond(new GroupLeader(girlList));


    }
}
