package com.zenAction.FactoryModal.HumanFacotryDemo;

public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
