package org.training.advanced.java;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person person = new Person("osman",
                                   "yaycıoğlu",
                                   "osty",
                                   LocalDate.of(1970,
                                                11,
                                                11),
                                   100,
                                   200);

        PersonX personX = PersonX.builder()
                                 .setFirstName("osman")
                                 .setLastName("yaycıoğlu")
                                 .setBirthdate(LocalDate.of(1970,
                                                            11,
                                                            11))
                                 .setNickName("osty")
                                 .setWeight(100)
                                 .setHeight(200)
                                 .build();

    }
}
