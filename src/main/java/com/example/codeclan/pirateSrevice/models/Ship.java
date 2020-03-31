package com.example.codeclan.pirateSrevice.models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ships")
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    @Column(name ="name")
    private String name;

    @OneToMany(mappedBy = "ship")
    private List<Pirate> pirates;

    public Ship(String name) {
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
    }

    public Ship(){

    }


    public String getName() {
        return name;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }
}
