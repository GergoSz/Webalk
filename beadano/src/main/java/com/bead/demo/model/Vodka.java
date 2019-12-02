package com.bead.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Vodka {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;
		private int alc;
		private int volume;
	    private String brand;

	    
		public Vodka(String name, String brand, int alc, int volume) {
			super();
			this.name = name;
			this.brand = brand;
			this.alc = alc;
			this.volume = volume;
		}

		public Vodka(Long id, String name, String brand, int alc, int volume) {
			super();
			this.id = id;
			this.name = name;
			this.brand = brand;
			this.alc = alc;
			this.volume = volume;
		}

		public Vodka() {
			super();
		}

}
