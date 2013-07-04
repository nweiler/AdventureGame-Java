package com.nweiler.adventuregame;

import java.util.*;

public class Player implements Actor {

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
	
	public void setItems(ArrayList<Carriable> items) {
		this.items = items;
	}

	public void move(Location location) {
		MarkerDecorator temp;
		if(location instanceof MarkerDecorator) {
			temp = (MarkerDecorator) location;
		}
		else {
			temp = new MarkerDecorator(location, new ArrayList<Marker>());
		}
		
		if(currentLocation != null) currentLocation.playerExit(this, location);
		temp.playerExit(this, location);
		if(temp.getMarkers().contains(new Marker("Green"))) {
			temp.addMarker(new Marker("Red"));
		}
		else {
			temp.addMarker(new Marker("Green"));
		}
		currentLocation = temp;
	}
	
	public Location explore(Location location) {
		ArrayList<Location> neighbors = new ArrayList<Location>();
		Location exit = null;
		Boolean hasRed = false;
		Boolean hasGreen = false;
		
		for(Location x: location.getNeighbors().keySet()) { neighbors.add(x); }
		
		for(Location x: neighbors) {
			if(x instanceof ExitDecorator) { exit = x; }
			else if (x instanceof Location) {
				this.move(x);
				this.explore(x);
			}
			else {
				MarkerDecorator temp = (MarkerDecorator) x;
				if(temp.getMarkers().contains(new Marker("Green"))) hasGreen = true;
				if(temp.getMarkers().contains(new Marker("Red"))) hasRed = true;
				
				if(hasRed && hasGreen) {
					for(Location y: neighbors) {
						MarkerDecorator temp2 = (MarkerDecorator) y;
						if(temp2.getMarkers().contains(new Marker("Green"))) {
							this.move(temp2);
							this.explore(temp2);
						}
					}
				}
			}
		}
		return exit;
	}
}