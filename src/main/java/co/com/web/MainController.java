/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.web;

import co.com.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
