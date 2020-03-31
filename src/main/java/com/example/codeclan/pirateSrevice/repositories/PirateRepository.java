package com.example.codeclan.pirateSrevice.repositories;

import com.example.codeclan.pirateSrevice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotate repository
@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

}
