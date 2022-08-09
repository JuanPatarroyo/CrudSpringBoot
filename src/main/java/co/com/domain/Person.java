/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author jpatarroyo
 */
@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @Column(name="nombre")
    @NotEmpty
    private String name;
    @Column(name="apellido")
    @NotEmpty
    private String surname;
    @NotEmpty
    @Email
    private String email;
    @Column(name="telefono")
    private String phone;
    @Column(name="saldo")
    @NotNull
    private Double balance;

    public Person() {
    }
    
}
