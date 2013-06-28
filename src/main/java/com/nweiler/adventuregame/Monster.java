package com.nweiler.adventuregame;

public class Monster implements Actor{

	private String name;
	private String type;
	private int health;
	
	public Monster(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
	}
	
	public void move() {
		
	}
	
	public int attack() {
		return 10;
	}
}
