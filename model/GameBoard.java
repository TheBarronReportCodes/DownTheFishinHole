package edu.westga.cs6312.fishing.model;

/**
 * creates the fundamental properties the Game Board
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class GameBoard {
	private FishingHole[] fishingHoles;
	private Angler anglerObject;
	private int anglerCurrentLocation;
	
	/**
	 * creates the game board
	 * tracks the state of the game
	 * 0 parameter constructor
	 */
	public GameBoard() {
		this.setupFishingHoles();
	}
	
	/**
	 * set's up our GameBoard objects
	 * helper method
	 */
	private void setupFishingHoles() {
		this.anglerObject = new Angler();
		this.fishingHoles = new FishingHole[10];

		for (int current = 0; current < this.fishingHoles.length; current++) {
			this.fishingHoles[current] = new FishingHole(current);
		}
		
		this.fishingHoles[this.anglerCurrentLocation] = this.fishingHoles[0];
	}
	
	/**
	 * Returns access to information on the angler
	 * @return the anglerObject Returns information on the anglerObject
	 */
	public Angler getAnglerObject() {
		return this.anglerObject;
	}

	/**
	 * Returns the current fishing hole the Angler is at
	 * @return the anglerCurrentLocation Returns the current fishing hole the Angler is at
	 */
	public FishingHole getCurrentLocation() {
		return this.fishingHoles[this.anglerCurrentLocation];
	}
	
	/**
	 * moves the location of the angler up a fishing hole. 
	 * If at the first fishing hole, move to the last one
	 */
	public void moveUp() {
		this.anglerCurrentLocation--;
		
		if (this.anglerCurrentLocation < 0) {
			this.anglerCurrentLocation = 9;
		}
	}
	
	/**
	 * moves the location of the angler down a fishing hole. 
	 * If at the last fishing hole, move to the first one
	 */
	public void moveDown() {
		this.anglerCurrentLocation++;
		
		if (this.anglerCurrentLocation > 9) {
			this.anglerCurrentLocation = 0;
		}
	}

	/**
	 * String representation of and the fish availability in each fishing Hole and
	 * the Angler's information and current location
	 */
	@Override
	public String toString() {
		String newString = "";
		
		for (int current = 0; current < this.fishingHoles.length; current++) {
			newString += this.fishingHoles[current].toString() + "\n";
		}
		newString += "\n" + this.anglerObject.toString() + " is at fishing hole [" + this.anglerCurrentLocation + "]";
		return newString;
	}

}
