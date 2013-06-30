package com.nweiler.adventuregame;

import java.util.*;

public class Room implements Location {

	private ArrayList<Actor> actors;
	private ArrayList<Fixture> fixtures;
	private String name;
	private String description;
	private HashMap<Location, Direction> neighbors;
	private ArrayList<TripRecorder> subscribers = new ArrayList<TripRecorder>();
	
	public ArrayList<Actor> getActors() {
		return actors;
	}
	
	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}
	
	public ArrayList<Fixture> getFixtures() {
		return fixtures;
	}
	
	public void setFixtures(ArrayList<Fixture> fixtures) {
		this.fixtures = fixtures;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public HashMap<Location, Direction> getNeighbors() {
		return neighbors;
	}
	
	public void setNeighbors(HashMap<Location, Direction> neighbors) {
		this.neighbors = neighbors;
	}
	
	public Room(String name, String description, ArrayList<Actor> actors, ArrayList<Fixture> fixtures, HashMap<Location, Direction> neighbors) {
		this.name = name;
		this.description = description;
		this.actors = actors;
		this.fixtures = fixtures;
		this.neighbors = neighbors;
		subscribers.add(TripRecorder.getInstance());
	}
	
	public void addNeighbor (Location room, Direction direction) {
		neighbors.put(room, direction);
	}
	
	public void removeNeighbor(Location room, Direction direction) {
		neighbors.remove(room);
	}
	
	public void addActor(Actor actor) {
		actors.add(actor);
	}
	
	public void removeActor(Actor actor) {
		actors.remove(actor);
	}
	
	public void addFixtures(Fixture fixture) {
		fixtures.add(fixture);
	}

	public void removeFixture(Fixture fixture) {
		fixtures.remove(fixture);
	}
	
	public void playerEnter(Actor actor, Location location) {
		actors.add(actor);
		for (TripRecorder x: subscribers) {
			x.reportEntrance(actor, location);
		}
	}
		
	public void playerExit(Actor actor, Location location) {
		actors.remove(actor);
		for (TripRecorder x: subscribers) {
			x.reportExit(actor, location);
		}
	}
	
	public String toString() {
		return name;
	}
	
	public void addSubscriber() {
		subscribers.add(TripRecorder.getInstance());
	}
	
	public void removeSubscriber() {
		subscribers.remove(TripRecorder.getInstance());
	}
}