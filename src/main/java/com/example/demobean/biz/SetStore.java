package com.example.demobean.biz;

import java.util.HashSet;

public class SetStore implements PersonStoreInterface {

    private HashSet<Person> persons = new HashSet<>();

    public void add(Person person){
        persons.add(person);
    }
    public int size(){
        return persons.size();
    }
}
