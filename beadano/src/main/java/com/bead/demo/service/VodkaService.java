package com.bead.demo.service;

import java.util.List;

import com.bead.demo.model.Vodka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bead.demo.persist.VodkaRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class VodkaService {
	private final VodkaRepo vodkaRepo;
	
	public Vodka getVodkaById(Long id) {
		return vodkaRepo.findById(id).orElse(new Vodka());
	}
	
	public List<Vodka> getAllVodka(){
		return vodkaRepo.findAll();
	}
	
	public Vodka createVodka(Vodka vodka) {
		return vodkaRepo.saveAndFlush(vodka);
	}
}
