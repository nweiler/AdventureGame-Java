package com.nweiler.adventuregame;

public class Energy implements Carriable {

	public String name;
	public String type;
	public int usesLeft;
	
	public Energy(String name, String type, int usesLeft) {
		this.name = name;
		this.type = type;
		this.usesLeft = usesLeft;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getUsesLeft() {
		return usesLeft;
	}
	
	public void setUsesLeft(int usesLeft) {
		this.usesLeft = usesLeft;
	}
	
	public void use() {
		
	}
}
