package com.app.ServerSide.modal.types;

public enum TypeOperation {

	CHARGEMENT("Chargement",0),
	DECHARGEMENT("Dechargement",1);
	
	private String name="";
	private int value;
	
	TypeOperation(String name,int value){
		this.name=name;
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
