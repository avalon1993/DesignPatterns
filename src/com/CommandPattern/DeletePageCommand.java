package com.CommandPattern;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
