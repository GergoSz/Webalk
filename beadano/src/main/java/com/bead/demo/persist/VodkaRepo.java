package com.bead.demo.persist;

import java.util.Optional;

import com.bead.demo.model.Vodka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VodkaRepo extends JpaRepository<Vodka, Long>{
	Optional<Vodka> findById(Long id);
	
	Vodka findByName(String name);
}
