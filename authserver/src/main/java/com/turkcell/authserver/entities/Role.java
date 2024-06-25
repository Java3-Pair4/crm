package com.turkcell.authserver.entities;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
@Table(name="roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;


    @Override
    public String getAuthority() {
        return this.name.toLowerCase();
    }






}
