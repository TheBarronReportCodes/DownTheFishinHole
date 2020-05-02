package edu.westga.cs6312.fishing.model;

/**
 * creates the fundamental properties of a Fishing Hole
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class FishingHole {
	private FishType fishObject;
	private int fishingHoleLocation;

	/**
	 * Creates a Fishing Hole at the specified location
	 * 1 parameter constructor
	 * @param fishingHoleLocation The specific location of the fishing hole
	 * @precondition the fishingHoleLocation input cannot be < 0. If it is, throw error. 
	 */
	public FishingHole(int fishingHoleLocation) {
		if (fishingHoleLocation < 0) {
			throw new IllegalArgumentException("cannot have negative fishing hole location");		
		}
		this.fishingHoleLocation = fishingHoleLocation;
		this.setupFishingHole();
	}
	
	/**
	 * creates a 50% chance that there is a Fish in the fishing hole
	 * (50% chance fishObject is initialized with a FishType subclass)
	 * helper method
	 */
	private void setupFishingHole() {
		double random = Math.random();
		
		if (random < 0.5) {
			this.fishObject = null;
		} else {
			this.fishObject = this.addFish();
		}
	}
	
	/**
	 * Creates/Adds a Small Fish
	 * helper method
	 * @return SmallFish Returns the instance of a SmallFish object
	 */
	private FishType addFish() {
		double random = Math.random();
		
		if (random < 0.5) {
			return new SmallFish();
		} else {
			return new LargeFish();
		}
	}
	
	/**
	 * String representation of the Fishing Holes location
	 * @return newString Returns the location of the fishing hole in string form
	 */
	public String getLocation() {
		String newString = "";
		newString += "Fishing hole at [" + this.fishingHoleLocation + "]";
		return newString;
	}
	
	/**
	 * the fish currently in the fishing Hole
	 * @return this.fishObject Returns the value of the fish objects actual type
	 */
	public FishType getFish() {
		return this.fishObject;
	}

	/**
	 * String representation of the Fishing Hole location and the small fish availability
	 */
	@Override
	public String toString() {
		String newString = "";
		
		if (this.fishObject == null) {
			newString += this.getLocation() + " containing no fish";
			return newString;
		}
		newString += this.getLocation() + " containing " + this.fishObject.toString();
		return newString;

	}

}
