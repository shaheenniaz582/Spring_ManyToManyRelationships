package com.example.codeclan.pirateSrevice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="raids")
public class Raid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "location")
    private String location;
    @Column(name = "loot")
    private int loot;
    @JsonIgnoreProperties("raid")
    @ManyToMany
    @JoinTable(
            name = "pirates_raids",
            joinColumns = { @JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Pirate> pirates;

    public Raid(String location, int loot) {
        this.location = location;
        this.loot = loot;
        this.pirates = new ArrayList<Pirate>();
    }

    public Raid(){

    }

    public String getLocation() {
        return location;
    }

    public int getLoot() {
        return loot;
    }

    public List<Pirate> getPirates() {
        return pirates;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }
    public void addPirtate(Pirate pirate){
        this.pirates.add(pirate);
    }
}
