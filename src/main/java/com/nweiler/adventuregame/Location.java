package com.nweiler.adventuregame;

public interface Location {

	public void addNeighbor(Location room, Direction direction);
	public void removeNeighbor(Location room, Direction direction);
}
