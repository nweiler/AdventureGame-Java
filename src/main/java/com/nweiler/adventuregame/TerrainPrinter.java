package com.nweiler.adventuregame;

import java.util.*;

public class TerrainPrinter {

	private static TerrainPrinter uniqueInstance;
	
	private TerrainPrinter() {}
	
	public static TerrainPrinter getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new TerrainPrinter();
		}
		return uniqueInstance;
	}
	
	public void print(Location location) {
		ArrayList<Location> reachable = new ArrayList<Location>();
	
		MarkerDecorator temp;
		if (location instanceof MarkerDecorator) {
			temp = (MarkerDecorator)location;
			temp.addMarker(new Marker("Yellow"));
		}
		else {
			temp = new MarkerDecorator(location , new ArrayList<Marker>());
			temp.addMarker(new Marker("Yellow"));
		}
		
		for (Location x: location.getNeighbors().keySet()) {
			MarkerDecorator myTemp;
			
			if (location instanceof MarkerDecorator) {
				myTemp = (MarkerDecorator) location;
				myTemp.addMarker(new Marker("Yellow"));
			}
			else {
				myTemp = new MarkerDecorator(location, new ArrayList<Marker>());
				myTemp.addMarker(new Marker("Yellow"));
			}
		
			ArrayList<Location> myNeighbors = new ArrayList<Location>();
			Boolean stuck = true;
			for (Location thisTemp: myTemp.getNeighbors().keySet()) {
				MarkerDecorator innerTemp = (MarkerDecorator) thisTemp;
				if(!(innerTemp.getMarkers().contains(new Marker("Yellow")))) {
					stuck = false;
				}
			}
			if(stuck) {
				for(Location z: location.getNeighbors().keySet()) {
					System.out.println(z);
				}
			}
			else {
				for(Location z: location.getNeighbors().keySet()) {
					System.out.println(z);
				}
			}
		}
	}
}
