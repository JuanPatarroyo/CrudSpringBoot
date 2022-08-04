/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.dao;

import co.com.domain.UserControl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jpatarroyo
 */
public interface InterfaceUserDao extends JpaRepository<UserControl, Long>{
    UserControl findByUsername(String username);
}
