package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * tests the creation of an Angler Object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class AnglerWhenCreateAngler {

	/**
	 * Test Angler Constructor 0 parameters show
	 * moneyUnits = 100
	 * fishCaught = 0
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerShouldHave100MoneyUnits0FishCaught() {
		Angler angler1 = new Angler();
		assertEquals("The Angler has 100 units and has caught 0 fish", angler1.toString());
	}

}
