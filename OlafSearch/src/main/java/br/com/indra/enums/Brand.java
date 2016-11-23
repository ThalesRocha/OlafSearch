package br.com.indra.enums;

public enum Brand {
	
	BRASTEMP("Brastemp"), //
	CONSUL("Consul"), //
	BOSCH("Bosch");
	
	private String brand;
	
	Brand(String marca){
		this.brand = marca;
	}

	public String getBrand() {
		return brand;
	}
	

}
