package com.example.rest.controller;

import com.example.rest.data.Person;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/person")
public class PersonContoller {

    Map<Integer, Person> custStores = new HashMap<Integer, Person>();

    private List<Person> persons = Arrays.asList(new Person("Amen" , 23) , new Person("Ahmed" , 20));

    @GetMapping("/get/all")
    public List<Person> getAllPersons(){
        return persons;
    }

    @GetMapping("/get/name")
    public Person getPersonByName(@RequestParam(value="name" ) String name ){
        for (Person person : persons ){
            if ( person.getName().equals(name) )
                return person;
        }
        return null;
    }

    @GetMapping("/get/age")
    public Person getPersonByAge(@RequestParam(value="age") int age){
        for (Person person : persons ){
            if ( (person.getAge() == age ) )
                return person;
        }
        return null;
    }

    @PostMapping("/post")
    public Person post(@RequestBody Person person){
        return null;
    }



}
