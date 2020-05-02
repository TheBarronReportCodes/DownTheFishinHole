package edu.westga.cs6312.fishing.model;

/**
 * creates the fundamental properties of an Angler
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class Angler {
	private int moneyUnits;
	private int fishCaught;
	
	/**
	 * Creates an Angler with 100 units of money and no fish
	 * 0 parameter constructor
	 */
	public Angler() {
		this.moneyUnits = 100;
		this.fishCaught = 0;
	}

	/**
	 * Returns the amount of money the Angler has currently
	 * @return the moneyUnits The current amount of money
	 */
	public int getMoneyUnits() {
		return this.moneyUnits;
	}

	/**
	 * Returns the amount of fish the Angler has caught currently
	 * @return the fishCaught The current amount of fish caught
	 */
	public int getFishCaught() {
		return this.fishCaught;
	}
	
	/**
	 * represents the Angler paying to fish
	 * @param amountPaid The amount it cost to fish. Will be deducted from current moneyUnits
	 * @precondition the amountPaid input cannot be < 0. If it is, throw error. 
	 * @precondition the amountPaid input cannot be > this.moneyUnits. If it is, throw error.
	 */
	public void payToFish(int amountPaid) {
		if (amountPaid < 0) {
			throw new IllegalArgumentException("cannot have negative amount paid");
		}
		if (amountPaid > this.moneyUnits) {
			throw new IllegalArgumentException("cannot afford to fish");
		}
		this.moneyUnits -= amountPaid;
	}
	
	/**
	 * represents the Angler catching a fish
	 * @param numberOfFish The amount of fish caught. Will be added to the current fishCaught
	 * @precondition the numberOfFish input cannot be < 0. If it is, throw error. 
	 */
	public void catchFish(int numberOfFish) {
		if (numberOfFish < 0) {
			throw new IllegalArgumentException("cannot have negative fish caught");
		}
		this.fishCaught += numberOfFish;
	}

	/**
	 * String representation of the Angler's money and number of fish caught
	 */
	@Override
	public String toString() {
		String newString = "";
		newString += "The Angler has " + this.moneyUnits + " units and has caught " + this.fishCaught + " fish";
		return newString;
	}
}
