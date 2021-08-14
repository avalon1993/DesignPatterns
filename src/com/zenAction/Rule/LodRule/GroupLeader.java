package com.zenAction.Rule.LodRule;

import java.util.List;

public class GroupLeader {

    private List<Girl> girlList;

    public GroupLeader(List<Girl> girlList) {
        this.girlList = girlList;
    }

//    public void countGirls(List<Girl> listGirls) {
//        System.out.println("女生的数量是：" + listGirls.size());
//    }

    public void countGirls() {
        System.out.println("女生的数量是：" + girlList.size());
    }
}
