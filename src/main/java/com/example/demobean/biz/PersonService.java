package com.example.demobean.biz;

public class PersonService {


    private PersonStoreInterface store;


    public PersonStoreInterface getStore() {
        return store;
    }

    public void setStore(PersonStoreInterface store) {
        this.store = store;
    }
}
