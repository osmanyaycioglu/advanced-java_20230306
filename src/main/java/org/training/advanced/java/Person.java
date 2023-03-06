package org.training.advanced.java;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String nickName;
    private LocalDate birthdate;
    private int weight;
    private int height;

    public Person(String firstNameParam,
                  String lastNameParam,
                  String nickNameParam,
                  LocalDate birthdateParam,
                  int weightParam,
                  int heightParam) {
        firstName = firstNameParam;
        lastName = lastNameParam;
        nickName = nickNameParam;
        birthdate = birthdateParam;
        weight = weightParam;
        height = heightParam;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
