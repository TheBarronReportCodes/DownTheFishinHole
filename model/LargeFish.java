package edu.westga.cs6312.fishing.model;

/**
 * Concrete Subclass of FishType that contains Specific information of a LargeFish
 * 
 * @author Jordan Barron
 * @version February 16th, 2020
 *
 */
public class LargeFish extends FishType {

	/**
	 *  Creates a large fish with a school size of 50
	 *  0 parameter constructor
	 */
	public LargeFish() {
		super(50);
	}

	/**
	 * the number of large fish caught.
	 * this number will be removed from the large Fish school
	 * @return 0-50 : random number of fish caught and thus removed from the school (ranging from 0 to 50)
	 */
	@Override
	public int catchFish() {
		int random = (int) (Math.random() * 50);
		this.removeFish(random);
		return random;
	}

	/**
	 * the cost of fishing for large Fish
	 * @return 50 : cost to fish
	 */
	@Override
	public int costToFish() {
		return 50;
	}
	
	/**
	 * String representation of the large Fish school size
	 */
	@Override
	public String toString() {
		return "large fish with " + super.toString();
	}
}
