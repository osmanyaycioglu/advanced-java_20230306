package org.training.advanced.java;

import java.time.LocalDate;

public class PersonX {
    private final String    firstName;
    private final String    lastName;
    private final String    nickName;
    private final LocalDate birthdate;
    private final int       weight;
    private final int       height;

    private PersonX(String firstNameParam,
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

    public static PersonXBuilder builder(){
        return new PersonXBuilder();
    }

    public static class PersonXBuilder {
        private String    firstName;
        private String    lastName;
        private String    nickName;
        private LocalDate birthdate;
        private int       weight;
        private int       height;

        private PersonXBuilder() {
        }

        public String getFirstName() {
            return firstName;
        }

        public PersonXBuilder setFirstName(String firstNameParam) {
            firstName = firstNameParam;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public PersonXBuilder setLastName(String lastNameParam) {
            lastName = lastNameParam;
            return this;
        }

        public String getNickName() {
            return nickName;
        }

        public PersonXBuilder setNickName(String nickNameParam) {
            nickName = nickNameParam;
            return this;
        }

        public LocalDate getBirthdate() {
            return birthdate;
        }

        public PersonXBuilder setBirthdate(LocalDate birthdateParam) {
            birthdate = birthdateParam;
            return this;
        }

        public int getWeight() {
            return weight;
        }

        public PersonXBuilder setWeight(int weightParam) {
            weight = weightParam;
            return this;
        }

        public int getHeight() {
            return height;
        }

        public PersonXBuilder setHeight(int heightParam) {
            height = heightParam;
            return this;
        }

        public PersonX build() {
            return new PersonX(firstName,
                               lastName,
                               nickName,
                               birthdate,
                               weight,
                               height);
        }
    }
}
