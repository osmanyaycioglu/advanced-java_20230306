package org.training.advanced.java.files;

import org.training.advanced.java.lab1.Customer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class FileRead2 {
    public static void main(String[] args) throws Exception {
        List<String> strings = Files.readAllLines(Paths.get("tempfile.txt"));
        Map<String, Customer> customerMap ;
    }

}
