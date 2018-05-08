package com.app.ServerSide.modal.types;

public enum PlanificationState {
	
	INACTIF("Inactif",0),
	EN_COURS("En cours",1),
	ACTIF("Actif",2);
	
	private String name;
	private int value;

	private PlanificationState(String name, int value) {
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
