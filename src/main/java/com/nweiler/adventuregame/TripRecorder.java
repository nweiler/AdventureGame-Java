package com.nweiler.adventuregame;

public class TripRecorder {

	private static TripRecorder uniqueInstance;
	
	private TripRecorder() {}
	
	public static TripRecorder getInstance() {
		if (uniqueInstance == null) { uniqueInstance = new TripRecorder(); }
		return uniqueInstance;
	}
	
	public void reportEntrance (Actor actor, Location location) {
		System.out.println(actor.getName() + " entered the " + location.toString() + "." );
	}
	
	public void reportExit (Actor actor, Location location) {
		System.out.println(actor.getName() + " exited the " + location.toString() + "." );
	}
}
