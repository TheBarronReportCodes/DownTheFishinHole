package edu.westga.cs6312.fishing.model;

/**
 * Abstract class that serves as base for all Fish
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public abstract class FishType {
	private int numberOfFishInSchool;
	
	/**
	 * Creates a Fish with a set number in the school
	 * @param numberOfFishInSchool The amount of fish available in the school (population)
	 * @precondition numberOfFishInSchool cannot be < 0. if negative, throw error
	 */
	public FishType(int numberOfFishInSchool) {
		if (numberOfFishInSchool < 0) {		
			throw new IllegalArgumentException("Invalid number of fish");
		}
		this.numberOfFishInSchool = numberOfFishInSchool;
	}

	/**
	 * Returns the amount of fish currently in the school
	 * @return the numberOfFishInSchool The current amount of fish in the school
	 */
	public int getNumberOfFishInSchool() {
		return this.numberOfFishInSchool;
	}
	
	/**
	 * represents Fish being removed from the school
	 * @param numberOfFish The amount of fish removed from the school. Will be deducted from the current school of fish
	 * @precondition the numberOfFish input cannot be < 0. If it is, throw error. 
	 * @precondition the numberOfFish input cannot be > this.numberOfFishInSchool. If it is, throw error.
	 */
	public void removeFish(int numberOfFish) {
		if (numberOfFish < 0) {
			throw new IllegalArgumentException("cannot have negative fish removed");
		
		}
		if (numberOfFish > this.numberOfFishInSchool) {
			throw new IllegalArgumentException("not enough fish to be removed");
		}
		this.numberOfFishInSchool -= numberOfFish;
	}
	
	/**
	 * the number of fish caught in the Fish subclass
	 * Creates requirement that all subclasses (unless abstract) must implement this method
	 * @return Returns the number of fish caught
	 */
	public abstract int catchFish();
	
	/**
	 * the cost of fishing for the Fish subclass
	 * Creates requirement that all subclasses (unless abstract) must implement this method
	 * @return Returns the cost of fishing
	 */
	public abstract int costToFish();
	
	/**
	 * String representation of the Fish's school size
	 */
	@Override
	public String toString() {
		String newString = "";
		newString += this.numberOfFishInSchool + " fish in the school";
		return newString;
	}

}
