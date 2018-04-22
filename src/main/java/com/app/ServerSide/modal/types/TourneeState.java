package com.app.ServerSide.modal.types;

public enum TourneeState {
	
	A_REALISER("A r�aliser","non encore affect�",0),
	EN_COURS("En cours","affect�",1),
	VALIDEE("Valid�e","valid�e",2),
	EN_ATTENTE("En attente","en attente d'etre valid�e",3),
	DECHARGEE("D�charg�e","d�charg�",4);
	
	private String name="";
	private String description="";
	private int value;
	
	TourneeState(String name,String description,int value){
		this.name=name;
		this.description=description;
		this.value=value;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
