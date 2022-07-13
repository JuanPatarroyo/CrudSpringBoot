/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.service;

import co.com.dao.InterfacePersonDao;
import co.com.domain.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Layer, responsible for connecting the view with the data layer
 * @author jpatarroyo
 */
@Service
public class PersonaServiceImplementation implements PersonService {

    @Autowired
    private InterfacePersonDao personDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Person> getPeople() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDao.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Person person) {
        return personDao.findById(person.getIdPersona()).orElse(null);
    }
    
}
