package com.nweiler.adventuregame;

public class Monster implements Actor {

	private String name;
	private String type;
	private int health;
	
	public Monster(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
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
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int attack() {
		return 10;
	}
	
	public void move(Location location) {
		
	}
}