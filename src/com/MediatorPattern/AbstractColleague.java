package com.MediatorPattern;

public class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        this.mediator = abstractMediator;
    }

}
