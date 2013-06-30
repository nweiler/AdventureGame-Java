package com.nweiler.adventuregame;

public interface Actor {

	public String getName();
	public void setName(String name);
	public void move(Location location);
}