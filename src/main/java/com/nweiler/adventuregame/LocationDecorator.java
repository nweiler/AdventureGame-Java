package com.nweiler.adventuregame;

import java.util.*;

public abstract class LocationDecorator implements Location {

	public abstract void addNeighbor(Location location, Direction direction);
	public abstract void removeNeighbor(Location location, Direction direction);
	public abstract HashMap<Location, Direction> getNeighbors();
	public abstract void playerEnter(Actor actor, Location location);
	public abstract void playerExit(Actor actor, Location location);
}
