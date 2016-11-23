package br.com.indra.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.indra.entity.Fridge;
import br.com.indra.enums.Brand;

public class Fridges {
	
	private static List<Fridge> geladeiras;
	
	public Fridges(){
		geladeiras = new ArrayList<>();
		geladeiras.add(Fridge.newInstance(1L, Brand.BOSCH.getBrand(), "FrostFree 10"));
		geladeiras.add(Fridge.newInstance(2L, Brand.BRASTEMP.getBrand(), "Duplex 2020"));
		geladeiras.add(Fridge.newInstance(3L, Brand.CONSUL.getBrand(), "Hipster"));
		geladeiras.add(Fridge.newInstance(4L, Brand.BOSCH.getBrand(), "Freezer"));
		geladeiras.add(Fridge.newInstance(5L, Brand.BRASTEMP.getBrand(), "Top"));
		
	}
	
	public List<Fridge> findAll(){
		return geladeiras;
	}

}
