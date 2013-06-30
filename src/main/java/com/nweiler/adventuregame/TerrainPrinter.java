package com.nweiler.adventuregame;

public class TerrainPrinter {

	private static TerrainPrinter uniqueInstance;
	
	private TerrainPrinter() {}
	
	public static TerrainPrinter getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new TerrainPrinter();
		}
		return uniqueInstance;
	}
}
