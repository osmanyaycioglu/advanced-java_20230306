package org.training.advanced.java.iterators;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;

public class Customer implements Iterable<Account> {

    private String        name;
    private String        surname;
    private Integer       height;
    private String        username;
    private String        password;
    private boolean       activated;
    private LocalDateTime activatedDate;
    private List<Account> accounts;
    private List<String> nickNames;

    public void addNickNames(String...strs){
        if (nickNames == null){
            nickNames = new ArrayList<>();
        }
        nickNames.addAll(Arrays.asList(strs));
    }

    public String getName() {
        return name;
    }

    public Customer setName(String nameParam) {
        name = nameParam;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surnameParam) {
        surname = surnameParam;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Customer setHeight(Integer heightParam) {
        height = heightParam;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Customer setUsername(String usernameParam) {
        username = usernameParam;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String passwordParam) {
        password = passwordParam;
        return this;
    }

    public boolean isActivated() {
        return activated;
    }

    public Customer setActivated(boolean activatedParam) {
        activated = activatedParam;
        return this;
    }

    public LocalDateTime getActivatedDate() {
        return activatedDate;
    }

    public Customer setActivatedDate(LocalDateTime activatedDateParam) {
        activatedDate = activatedDateParam;
        return this;
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }


    public Customer addAccounts(List<Account> accountsParam) {
        if (accounts == null){
            accounts = new ArrayList<>();
        }
        accounts.addAll(accountsParam);
        return this;

    }

    public Customer addAccount(Account accountsParam) {
        if (accounts == null){
            accounts = new ArrayList<>();
        }
        accounts.add(accountsParam);
        return this;
    }

    @Override
    public Iterator<Account> iterator() {
        return accounts.iterator();
    }

    @Override
    public void forEach(Consumer<? super Account> action) {
        accounts.forEach(action);
    }

    @Override
    public Spliterator<Account> spliterator() {
        return accounts.spliterator();
    }

    public Iterator<String> getNickNameIterator(){
        return new AnotherIterator();
    }

    public NickNameIter getNickNameIterable(){
        return new NickNameIter();
    }

    public class AnotherIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return nickNames.size() > index;
        }

        @Override
        public String next() {
            return nickNames.get(index++);
        }
    }

    public class NickNameIter implements Iterable<String> {

        @Override
        public Iterator<String> iterator() {
            return new AnotherIterator();
        }

        @Override
        public void forEach(Consumer<? super String> action) {
            nickNames.forEach(action);
        }

        @Override
        public Spliterator<String> spliterator() {
            return nickNames.spliterator();
        }
    }

}
