package com.AdapterPattern;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名叫做。。。");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭住址。。。");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这里是员工的手机电话。。。");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这是办公室电话。。。");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这里是员工的家庭住址。。。");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这个人的职位是Boss。。。");
        return null;
    }
}
