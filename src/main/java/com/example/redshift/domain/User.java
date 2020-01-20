package com.example.redshift.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter @Setter @ToString
public class User {
    @Id
    @Column(name="userid")
    private long id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;
}
