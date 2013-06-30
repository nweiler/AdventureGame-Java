package com.nweiler.adventuregame;

import java.util.*;

public class Player {

	private String name;
	private String gender;
	private int health;
	private ArrayList<Carriable> items;
	private Location currentLocation;
	
	public Player() {		
	}
	
	public Player(String name, String gender, int health, ArrayList<Carriable> items) {
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.items = items;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public ArrayList<Carriable> getItems() {
		return items;
	}

	public void move(Location location) {
		
	}
}
