package com.xworkz.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.service.PersonService;

@Controller
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public String getAllPersons(Model model) {
        List<PersonDTO> persons = personService.getAllPersons();
        model.addAttribute("persons", persons);
        return "persons/list";
    }

    @GetMapping("/{id}")
    public String getPersonById(@PathVariable Long id, Model model) {
        PersonDTO person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "persons/details";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("person", new PersonDTO());
        return "persons/add";
    }

    @PostMapping("/add")
    public String addPerson(@ModelAttribute("person") PersonDTO personDTO) {
        personService.savePerson(personDTO);
        return "redirect:/persons";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        PersonDTO person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "persons/edit";
    }

    @PostMapping("/edit/{id}")
    public String updatePerson(@PathVariable Long id, @ModelAttribute("person") PersonDTO updatedPersonDTO) {
        personService.updatePerson(id, updatedPersonDTO);
        return "redirect:/persons";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "redirect:/persons";
    }
}