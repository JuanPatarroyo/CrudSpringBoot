/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.service;

import co.com.domain.Person;
import java.util.List;

/**
 *
 * @author jpatarroyo
 */
public interface PersonService {
    
    public List<Person> getPeople();
    
    public void save(Person person);
    
    public void delete(Person person);
    
    public Person findPerson(Person person);
}
