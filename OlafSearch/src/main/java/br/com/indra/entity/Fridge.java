package br.com.indra.entity;

public class Fridge {
	
	private Long id;
	private String brand;
	private String model;

	public static Fridge newInstance(Long id, String brand, String model){
		return new Fridge(id, brand, model);
	}
	
	private Fridge(Long id, String brand, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
	}
	
	private Fridge() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
