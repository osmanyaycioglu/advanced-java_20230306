package org.training.advanced.java.files;

import org.training.advanced.java.collections.lab1.Customer;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class FileRead2 {
    public static void main(String[] args) throws Exception{
        List<String> strings = Files.readAllLines(Paths.get("tempfile.txt"));
        Map<String, Customer> customerMap;
        FileRead2 fileRead2 = new FileRead2();
        fileRead2.method1();
    }

    public void method1() {
        int a = 10;
        method2();
    }

    public void method2() {
        int a = 20;
        method3();
    }

    public void method3() {
        int a = 30;


    }
}
