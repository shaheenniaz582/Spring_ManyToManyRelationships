package com.example.codeclan.pirateSrevice;

import com.example.codeclan.pirateSrevice.models.Pirate;
import com.example.codeclan.pirateSrevice.models.Raid;
import com.example.codeclan.pirateSrevice.models.Ship;
import com.example.codeclan.pirateSrevice.repositories.PirateRepository;
import com.example.codeclan.pirateSrevice.repositories.RaidRepository;
import com.example.codeclan.pirateSrevice.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateSreviceApplicationTests {
	@Autowired
			// at backend spring has created an instance
	PirateRepository pirateRepository;
	@Autowired
	ShipRepository shipRepository;
	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirateAndShip(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);
		Pirate jack = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(jack);
		Raid raid = new Raid("Glasgow",1000);
		raidRepository.save(raid);

	}

}
