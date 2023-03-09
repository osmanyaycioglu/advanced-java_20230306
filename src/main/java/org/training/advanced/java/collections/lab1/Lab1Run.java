package org.training.advanced.java.collections.lab1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab1Run {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(final String[] args) throws Exception {
        List<Customer> customerList = Files.readAllLines(Paths.get("customer.txt"))
                                           .stream()
                                           .skip(1)
                                           .map(line -> line.split(","))
                                           .filter(sa -> sa.length == 8)
                                           .map(Lab1Run::createCustomer)
                                           .filter(Customer::isActivated)
                                           .collect(Collectors.toList());
        customerList.forEach(System.out::println);
        Map<String, Customer> collectLoc = customerList.stream()
                                                       .collect(Collectors.toMap(c -> c.getUsername(),
                                                                                 c -> c));
        IntSummaryStatistics heightStatisticsLoc = customerList.stream()
                                                               .mapToInt(Customer::getHeight)
                                                               .summaryStatistics();
        System.out.println(heightStatisticsLoc);
    }

    public static Customer createCustomer(final String[] sa) {
        return new Customer().setName(sa[0])
                             .setSurname(sa[1])
                             .setHeight(Integer.parseInt(sa[2]))
                             .setUsername(sa[3])
                             .setPassword(sa[4])
                             .setActivated(Boolean.parseBoolean(sa[5]))
                             .setActivatedDate(LocalDateTime.from(Lab1Run.dtf.parse(sa[6])))
                             .setAccounts(Arrays.stream(sa[7].split(";"))
                                                .map(Lab1Run::createAccount)
                                                .collect(Collectors.toList()));

    }

    private static Function<? super String[], ? extends Customer> createCustomerFunc(final DateTimeFormatter dtf) {
        return sa -> new Customer().setName(sa[0])
                                   .setSurname(sa[1])
                                   .setHeight(Integer.parseInt(sa[2]))
                                   .setUsername(sa[3])
                                   .setPassword(sa[4])
                                   .setActivated(Boolean.parseBoolean(sa[5]))
                                   .setActivatedDate(LocalDateTime.from(dtf.parse(sa[6])))
                                   .setAccounts(Arrays.stream(sa[7].split(";"))
                                                      .map(Lab1Run::createAccount)
                                                      .collect(Collectors.toList()));
    }

    public static Account createAccount(final String str) {
        String[] splitLoc = str.split("#");
        return new Account().setAccountType(EAccountType.valueOf(splitLoc[0]))
                            .setAmount(Integer.parseInt(splitLoc[1]));
    }

}
