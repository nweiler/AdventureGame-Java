package com.nweiler.adventuregame;

public class Bridge implements Fixture {

	public String type;
	
	public Bridge(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void act() {
		
	}
}
