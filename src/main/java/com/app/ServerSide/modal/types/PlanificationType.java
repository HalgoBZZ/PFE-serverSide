package com.app.ServerSide.modal.types;

public enum PlanificationType {
	PROCHAIN("Prochain",0),
	PREMIER_DE_MOIS("Premier de mois",1),
	CHAQUE_SEMAINE("Chaque semaine",2);
	
	private String name;
	private int value;

	PlanificationType(String name,int value) {
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
