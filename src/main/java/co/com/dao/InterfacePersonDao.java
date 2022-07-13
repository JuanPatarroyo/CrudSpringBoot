/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.dao;

import co.com.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jpatarroyo
 */
public interface InterfacePersonDao extends CrudRepository<Person, Long> {
    
}
