package br.com.indra.factory;

import br.com.indra.entity.Fridge;

public class FridgeFactory {

	public static FridgeFactory nova() {
		return new FridgeFactory();
	}

	public Fridge fabricar(Long codigo, String marca, String modelo) {
		return Fridge.newInstance(codigo, marca, modelo);
	}

}
