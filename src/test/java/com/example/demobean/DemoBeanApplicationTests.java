package com.example.demobean;

import com.example.demobean.biz.Person;
import com.example.demobean.biz.PersonService;
import com.example.demobean.biz.PersonStoreInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoBeanApplicationTests {

    @Autowired
    PersonService personService;

    @Test
    void testBeanInjection() {
        Assertions.assertNotNull(personService.getStore());

        PersonStoreInterface store = personService.getStore();
        Person person = new Person("Alain", "Delon");
        store.add(person);
        store.add(person);

        Assertions.assertEquals(1, store.size());
    }
}
