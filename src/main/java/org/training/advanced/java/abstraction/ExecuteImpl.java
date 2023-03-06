package org.training.advanced.java.abstraction;

public class ExecuteImpl implements IExecute{
    @Override
    public String execute(String sParam) {
        return "executing : " + sParam;
    }
}
