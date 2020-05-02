package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * tests the getMoneyUnits method of the Angler object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class AnglerWhenGetMoney {

	/**
	 * Test Angler Constructor 0 parameters show
	 * getMoneyUnits = 100
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerShouldHave100GetMoneyUnits() {
		Angler angler1 = new Angler();
		assertEquals(100, angler1.getMoneyUnits());
	}

}
