package br.com.indra.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.indra.entity.Fridge;
import br.com.indra.repository.Fridges;

@RestController
@RequestMapping("/geladeira")
public class GeladeiraController {

	Fridges fridges = new Fridges();

	@RequestMapping(method = RequestMethod.GET)
	public List<Fridge> listing() {

		return this.fridges.findAll();

	}

	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody Fridge createFridge(@RequestBody Fridge fridge) {
		System.out.println("Chamou o POST!!");
		return fridge;
	}

}
