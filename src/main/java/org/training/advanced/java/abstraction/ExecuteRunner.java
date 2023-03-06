package org.training.advanced.java.abstraction;

public class ExecuteRunner {
    public static void main(String[] args) {
        final int count = 10;
        IExecute execute1 = new ExecuteImpl();
        System.out.println(execute1.execute("task1"));

        IExecute execute2 = new IExecute() {
            @Override
            public String execute(String sParam) {
                return count + " Executing with anonymous class 1 : " + sParam;
            }
        };

        IExecute execute3 = new IExecute() {
            @Override
            public String execute(String sParam) {
                return count + " Executing with anonymous class 2 : " + sParam;
            }
        };
        IExecute execute4 = s -> count + " Executing with lambda 1 : " + s;

        System.out.println(execute4.execute("task2"));

    }
}
