package com.nweiler.adventuregame;

import java.util.*;

public class GameInstance {

	public static void main(String[] args) {
	
		TripRecorder tripRecorder = TripRecorder.getInstance();
		
		Location dropZone = new Room (
                "Drop Zone",
                "The starting room",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );
		
		Location ropeBridge = new Room(
                "Rope Bridge",
                "A path leading into a forest",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location trailhead = new Room(
                "Trailhead",
                "A fork in the trail with four exits",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location oceanCliffs = new Room(
                "Ocean Cliffs",
                "Shear, rocky cliffs overlooking a beach",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location beach = new Room(
                "Beach",
                "A deserted beach that extends as far as the eye can see",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location tidePool = new Room(
                "Tide Pool",
                "A turbulent pool surrounded by cliffs.",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location caveEntrance = new Room(
                "Cave Entrance",
                "A small, dark opening leading into the cliffside",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location smallChamber = new Room(
                "Small Chamber",
                "A small room within the cave",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location largeChamber = new Room(
                "Large Chamber",
                "A large room within the cave",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location greatChamber = new Room(
                "Great Chamber",
                "A giant room in the cave",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location monsterLair = new Room(
                "Monster Lair",
                "A foul smelling chamber with a pile of bones",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location mountainLookout = new Room(
                "Mountain Lookout",
                "A clearing on top of a hill",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location radioTower = new Room(
                "Radio Tower",
                "A tower with a radio inside",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location helipad = new Room(
                "Helipad",
                "A mountain clearing with room for a helicopter to land",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location volcanoRidge = new Room(
                "Volcano Ridge",
                "A narrow trail looking into a volcano",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location visitorCenter = new Room(
                "Visitor Center",
                "A large, abandoned building",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location powerPlant = new Room(
                "Power Plant",
                "An old coal power plant",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location dock = new ExitDecorator(new Room(
                "Dock",
                "A small, rickety dock",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                ));

		Location enchantedSpring = new Room(
                "Enchanted Spring",
                "A forest clearing with a still spring in the middle",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location apiary = new Room(
                "Apiary",
                "A collection of beehives with bees inside",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location wolfDen = new Room(
                "Wolf Den",
                "An incut in a rock wall with wolves inside",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );

		Location secretVault = new Room(
                "Secret Vault",
                "A large room filled with treasure",
                new ArrayList<Actor>(),
                new ArrayList<Fixture>(),
                new HashMap<Location, Direction>()
                );
		
		dropZone.addNeighbor(ropeBridge, Direction.NORTH);

        ropeBridge.addNeighbor(trailhead, Direction.NORTH);
        ropeBridge.addNeighbor(dropZone, Direction.SOUTH);

        trailhead.addNeighbor(enchantedSpring, Direction.DOWN);
        trailhead.addNeighbor(ropeBridge, Direction.SOUTH);
        trailhead.addNeighbor(oceanCliffs, Direction.EAST);
        trailhead.addNeighbor(mountainLookout, Direction.WEST);

        oceanCliffs.addNeighbor(caveEntrance, Direction.DOWN);
        oceanCliffs.addNeighbor(tidePool, Direction.SOUTH);
        oceanCliffs.addNeighbor(beach, Direction.DOWN);
        oceanCliffs.addNeighbor(trailhead, Direction.WEST);

        beach.addNeighbor(tidePool, Direction.SOUTH);

        tidePool.addNeighbor(oceanCliffs, Direction.UP);

        caveEntrance.addNeighbor(oceanCliffs, Direction.UP);
        caveEntrance.addNeighbor(smallChamber, Direction.WEST);
        caveEntrance.addNeighbor(largeChamber, Direction.EAST);

        smallChamber.addNeighbor(greatChamber, Direction.NORTH);
        smallChamber.addNeighbor(caveEntrance, Direction.SOUTH);

        largeChamber.addNeighbor(greatChamber, Direction.NORTH);
        largeChamber.addNeighbor(caveEntrance, Direction.SOUTH);

        greatChamber.addNeighbor(smallChamber, Direction.WEST);
        greatChamber.addNeighbor(largeChamber, Direction.EAST);
        greatChamber.addNeighbor(monsterLair, Direction.NORTH);

        monsterLair.addNeighbor(greatChamber, Direction.WEST);
        monsterLair.addNeighbor(beach, Direction.SOUTH);

        mountainLookout.addNeighbor(volcanoRidge, Direction.UP);
        mountainLookout.addNeighbor(radioTower, Direction.SOUTH);
        mountainLookout.addNeighbor(helipad, Direction.WEST);

        radioTower.addNeighbor(mountainLookout, Direction.NORTH);

        helipad.addNeighbor(mountainLookout, Direction.EAST);

        volcanoRidge.addNeighbor(mountainLookout, Direction.DOWN);
        volcanoRidge.addNeighbor(visitorCenter, Direction.DOWN);

        visitorCenter.addNeighbor(dock, Direction.DOWN);
        visitorCenter.addNeighbor(volcanoRidge, Direction.UP);
        visitorCenter.addNeighbor(powerPlant, Direction.NORTH);

        powerPlant.addNeighbor(visitorCenter, Direction.SOUTH);

        dock.addNeighbor(visitorCenter, Direction.UP);

        enchantedSpring.addNeighbor(trailhead, Direction.UP);
        enchantedSpring.addNeighbor(apiary, Direction.WEST);
        enchantedSpring.addNeighbor(wolfDen, Direction.NORTH);

        apiary.addNeighbor(enchantedSpring, Direction.EAST);

        wolfDen.addNeighbor(secretVault, Direction.DOWN);
        wolfDen.addNeighbor(enchantedSpring, Direction.SOUTH);

        secretVault.addNeighbor(wolfDen, Direction.UP);

        Player player = new Player("Link", "Male", 100, null);

        player.move(dropZone);
        player.move(ropeBridge);
        player.move(trailhead);

        // TODO TerrainPrinter.getInstance().print(dropZone);

        player.explore(dropZone);
	}
}