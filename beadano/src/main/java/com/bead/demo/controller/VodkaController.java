package com.bead.demo.controller;

import com.bead.demo.model.*;
import com.bead.demo.service.VodkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.net.URI;

@Controller
@RequestMapping(value = "vodka")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class VodkaController {
	private final VodkaService vs;
	
	@GetMapping("{id}")
	public ResponseEntity<Vodka> getVodkaById(@PathVariable Long id){
		return ResponseEntity.ok(vs.getVodkaById(id));
	}
	
	@GetMapping
	public ModelAndView showVodkaList() {
		ModelAndView mav = JSPController.mav;
		mav.setViewName("vodkalist");
		mav.addObject("vodkalist", vs.getAllVodka());
		
		
		return mav;
	}

	@PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public @ResponseBody ResponseEntity<Vodka> createVodka(@RequestParam("name") String name,
															   @RequestParam("brand") String brand,
															   @RequestParam("alc") int alc,
															   @RequestParam("volume") int volume){
		Vodka saved = vs.createVodka(new Vodka(name, brand, alc, volume) );
		
		return ResponseEntity.created(URI.create("" + saved.getId())).body(saved);
	}
	
	@PostMapping(value = "/displaydetails" ,consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	public @ResponseBody ModelAndView displayDetails(@RequestParam("id") long id){
		Vodka selected = vs.getVodkaById(id);
		ModelAndView mav = com.bead.demo.controller.JSPController.mav;
		mav.setViewName("vodkadetails");
		mav.addObject("chosenv", selected);
		
		return mav;
	}
}
