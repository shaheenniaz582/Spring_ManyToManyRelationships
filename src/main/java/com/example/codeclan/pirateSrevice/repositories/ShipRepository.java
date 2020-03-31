package com.example.codeclan.pirateSrevice.repositories;

import com.example.codeclan.pirateSrevice.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
