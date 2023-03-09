package org.training.advanced.java.exceptions;

import org.training.advanced.java.Car;

import java.io.IOException;

public class ExceptionUsage {
    private int count = 0;

    public static void main(String[] args) {
        ExceptionUsage exceptionUsage = new ExceptionUsage();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("------- " + i + " ------------------");
                try {
                    exceptionUsage.method1();
                    // code...
                    System.out.println("Success path");
                } catch (MyException eParam) {
                    System.out.println("My Error oldu : " + eParam);
                } catch (NullPointerException | IllegalStateException eParam) {
                    System.out.println("Runtime error oldu");
                } catch (IOException exceptionParam){
                    System.out.println("IO error oldu");
                } finally {
                    System.out.println("Burası hep çalışır");
                }
            }
        } catch (Throwable eParam) {
            System.out.println("Dış exception");
        }
        System.out.println("main sonu");
    }

    public void method1() throws MyException,IOException {
        int a = 10;
        method2();
        System.out.println("method1 sonu");
    }

    public void method2() throws MyException,IOException {
        int a = 20;

        method3();
        System.out.println("method2 sonu");
    }

    public void method3() throws MyException,IOException {
        int a = 30;
        count++;
        if (count == 2){
            throw new MyException("method3 exception problemi ",10,1001,new Car());
        } else if (count==3) {
            throw new IllegalStateException("bu state olmadı");
        } else if (count==4) {
            throw new IOException("IO problemi");
        } else if (count==5) {
            throw new IllegalArgumentException("count doğru değil");
        }

    }
}
