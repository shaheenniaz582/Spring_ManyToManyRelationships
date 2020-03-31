package com.example.codeclan.pirateSrevice.repositories;

import com.example.codeclan.pirateSrevice.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {
}
