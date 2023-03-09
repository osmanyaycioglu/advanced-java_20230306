package org.training.advanced.java.iterators;

import org.training.advanced.java.collections.lab1.EAccountType;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IterRunner {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws Exception{
        List<Customer> customerList = Files.readAllLines(Paths.get("customer.txt"))
                                                                           .stream()
                                                                           .skip(1)
                                                                           .map(line -> line.split(","))
                                                                           .filter(sa -> sa.length == 8)
                                                                           .map(IterRunner::createCustomer)
                                                                           .filter(Customer::isActivated)
                                                                           .collect(Collectors.toList());

        Customer customer = customerList.get(0);
        for (Account account : customer) {
            System.out.println(account);
        }

        customer.addNickNames("osty","osi","osmen","osm");
        Iterator<Account> iterator = customer.iterator();
        while (iterator.hasNext()){
            Account next = iterator.next();
            System.out.println(next);
        }
        System.out.println("------------------");
        Iterator<String> nickNameIterator = customer.getNickNameIterator();
        while (nickNameIterator.hasNext()){
            String next = nickNameIterator.next();
            System.out.println(next);
        }

        for (String s : customer.getNickNameIterable()) {
            System.out.println("NickName : " + s);
        }

//        List<Account> accounts = customer.getAccounts();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }
//        accounts.add(new Account());
    }

    public static Customer createCustomer(final String[] sa) {
        return new Customer().setName(sa[0])
                             .setSurname(sa[1])
                             .setHeight(Integer.parseInt(sa[2]))
                             .setUsername(sa[3])
                             .setPassword(sa[4])
                             .setActivated(Boolean.parseBoolean(sa[5]))
                             .setActivatedDate(LocalDateTime.from(IterRunner.dtf.parse(sa[6])))
                             .addAccounts(Arrays.stream(sa[7].split(";"))
                                                .map(IterRunner::createAccount)
                                                .collect(Collectors.toList()));

    }


    public static Account createAccount(final String str) {
        String[] splitLoc = str.split("#");
        return new Account().setAccountType(EAccountType.valueOf(splitLoc[0]))
                            .setAmount(Integer.parseInt(splitLoc[1]));
    }

}
