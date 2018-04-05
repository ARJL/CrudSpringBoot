package com.example.rest.controllers;

import com.example.rest.data.Person;
import com.example.rest.data.PersonRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


//@RestController
@Controller
//@ResponseBody
@RequestMapping (value = "/persons")
public class PersonContoller {

    @Autowired
    private PersonRepository repository;

    @GetMapping
    public String all(Model model){
        model.addAttribute("persons",repository.findAll());
        return "list";
    }

    @GetMapping("/get/all")
    public String getAllPersons(Model model){
        model.addAttribute("persons",repository.findAll());
        //System.out.print(model.toString());
        return "list";
    }

    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable(value = "id") int id){
        repository.delete(id);
        return "redirect:/persons/get/all" ;
    }
    //*****************
    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable(value = "id") int id , Model model){
        Person person = repository.findOne(id);
        model.addAttribute(person);
        return  "edit" ;
    }

    @PostMapping(value = "/update")    //here
    public String update(@RequestParam("id") int id , @RequestParam("name") String name){
        Person person = repository.findOne(id);
        person.setName(name);
        repository.save(person);
        return "redirect:/persons/get/all";
    }


    //*****************

    @GetMapping(value = "/new")
    public String add(){
        return "new" ;
    }

    @PostMapping(value = "/create")     //here
    public String create(@RequestParam(value = "name") String name){
        repository.save(new Person(name));
        return "redirect:/persons/get/all" ;
    }

}
