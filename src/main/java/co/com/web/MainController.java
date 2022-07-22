/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.web;

import co.com.domain.Person;
import co.com.service.PersonService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jpatarroyo
 */
@Controller
@Slf4j
public class MainController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String index(Model model) {
        var people = personService.getPeople();
        log.info("Executing Spring MVC controller...");
        model.addAttribute("people", people);
        return "index";
    }

    @GetMapping("/actionPerson")
    public String actionPerson(Person person) {
        return "personActions";
    }

    @PostMapping("/save")
    public String save(@Valid Person person, Errors errors) {
        if (errors.hasErrors()) {
            return "personActions";
        }
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/update/{idPersona}")
    public String update(Person person, Model model) {
        person = personService.findPerson(person);
        model.addAttribute("person", person);
        return "personActions";
    }

    @GetMapping("/delete")
    public String delete(Person person) {
        personService.delete(person);
        return "redirect:/";
    }
}
