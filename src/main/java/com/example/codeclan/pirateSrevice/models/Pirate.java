package com.example.codeclan.pirateSrevice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// POJO (Plain Old Java Object)
// All attributes should b private and have getter and setter
// need default constructor
//need Long id.
@Entity
@Table(name="pirates") // plural of class
public class Pirate {
    // Instance Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @JsonIgnoreProperties("pirates")
    @ManyToOne
    @JoinColumn(name = "ship_id", nullable = false)
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name ="pirates_raids",
            joinColumns = {@JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false)
             }
            )
    private List<Raid> raids;

    private Ship ship;

    public Pirate(String firstName, String lastName, int age ,Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ship = ship;
    }

    //Default Constructor
    public  Pirate(){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addRaid(Raid raid){
        this.raids.add(raid);
    }

}
