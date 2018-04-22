package com.app.ServerSide.modal.types;

public enum Day {

	DIMANCHE("Dimanche",0),
	LUNDI("Lundi",1),
	MARDI("Mardi",2),
	MERCREDI("Mercredi",3),
	JEUDI("Jeudi",4),
	VENDREDI("Vendredi",5),
	SAMEDI("Samedi",6);
	
	private String name;
	private int value;

	private Day(String name, int value) {
		this.name = name;
		this.value=value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
