package com.nweiler.adventuregame;

import java.util.*;

public class ExitDecorator extends LocationDecorator {

	private Location location;
	private ArrayList<TripRecorder> subscribers = new ArrayList<TripRecorder>();
	
	public ExitDecorator(Location location) {
		this.location = location;
		subscribers.add(TripRecorder.getInstance());
	}
	
	public void addNeighbor(Location location, Direction direction) {
		location.addNeighbor(location, direction);
	}
	
	public void removeNeighbor(Location location, Direction direction) {
		location.removeNeighbor(location, direction);
	}
	
	public HashMap<Location, Direction> getNeighbors() {
		return location.getNeighbors();
	}
	
	public void playerEnter(Actor actor, Location location) {
		location.playerEnter(actor, location);
		for(TripRecorder x: subscribers) {
			x.reportEntrance(actor, location);
		}
	}
	
	public void playerExit(Actor actor, Location location) {
		location.playerExit(actor, location);
		for (TripRecorder x: subscribers) {
			x.reportExit(actor, location);
		}
	}
	
	public void addSubscriber() {
		subscribers.add(TripRecorder.getInstance());
	}
	
	public void removeSubscriber() {
		subscribers.remove(TripRecorder.getInstance());
	}
}
