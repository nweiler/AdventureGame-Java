package com.nweiler.adventuregame;

import java.util.*;

public class MarkerDecorator extends LocationDecorator {

	private Location location;
	private ArrayList<TripRecorder> subscribers = new ArrayList<TripRecorder>();
	private ArrayList<Marker> markers;
	
	public MarkerDecorator(Location location, ArrayList<Marker> markers) {
		this.location = location;
		this.markers = markers;
		subscribers.add(TripRecorder.getInstance());
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
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
		for (TripRecorder x: subscribers) {
			x.reportEntrance(actor, this);
		}
	}
	
	public void playerExit(Actor actor, Location location) {
		location.playerExit(actor, location);
		for (TripRecorder x: subscribers) {
			x.reportExit(actor, location);
		}
	}
	
	public String toString() {
		return location.toString();
	}

	public void addSubscriber() {
		subscribers.add(TripRecorder.getInstance());
	}
	
	public void removeSubscriber() {
		subscribers.remove(TripRecorder.getInstance());
	}
	
	public void addMarker(Marker marker) {
		markers.add(marker);
	}
	
	public ArrayList<Marker> getMarkers() {
		return markers;
	}
}
