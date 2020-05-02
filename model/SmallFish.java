package edu.westga.cs6312.fishing.model;

/**
 * Concrete Subclass of FishType that contains Specific information of a Small Fish
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class SmallFish extends FishType {
	
	/**
	 *  Creates a small fish with a school size of 100
	 *  0 parameter constructor
	 */
	public SmallFish() {
		super(100);
	}

	/**
	 * the number of small fish caught.
	 * this number will be removed from the Small Fish school
	 * @return 50 : number of fish caught and thus removed from the school
	 */
	@Override
	public int catchFish() {
		this.removeFish(50);
		return 50;
	}
	
	/**
	 * the cost of fishing for Small Fish
	 * @return 25 : cost to fish
	 */
	@Override
	public int costToFish() {
		return 25;
	}
	
	/**
	 * String representation of the Small Fish school size
	 */
	@Override
	public String toString() {
		return "small fish with " + super.toString();
	}

}
