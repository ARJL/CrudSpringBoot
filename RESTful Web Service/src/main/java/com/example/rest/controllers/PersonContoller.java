package com.example.rest.controllers;

import com.example.rest.data.Person;
import com.example.rest.data.PersonRepository;
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

    @GetMapping("/get/all")
    public String getAllPersons(Model model){
        model.addAttribute("persons",repository.findAll());
        //System.out.print(model.toString());
        return "list";
    }

    @GetMapping(value = "/delete/{id}")
    public ModelAndView delete(@PathVariable(value = "id") int id){
        repository.delete(id);
        return new ModelAndView("redirect:/persons/get/all") ;
    }

    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable(value = "id") int id , Model model){
        Person person = repository.findOne(id);
        model.addAttribute(person);
        return  "edit" ;
    }

    @PostMapping(value = "/update")
    public ModelAndView update(){
        return  new ModelAndView("redirect:/persons/get/all");
    }

    @GetMapping(value = "/new")
    public String add(){
        return "new" ;
    }

    @PostMapping(value = "/create")
    public ModelAndView create(@RequestParam(value = "name") String name){
        repository.save(new Person(name));
        return new ModelAndView("redirect:/persons/get/all") ;
    }

    @GetMapping(value = "/create")
    public ModelAndView create1(@RequestParam(value = "name") String name){
        repository.save(new Person(name));
        return new ModelAndView("redirect:/persons/get/all") ;
    }





}
