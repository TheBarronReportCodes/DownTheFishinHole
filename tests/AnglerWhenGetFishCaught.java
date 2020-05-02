package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * tests the getFishCaught method of the Angler object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class AnglerWhenGetFishCaught {

	/**
	 * Test Angler Constructor 0 parameters show
	 * getFighCaught = 0
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerShouldHave0GetFishCaught() {
		Angler angler1 = new Angler();
		assertEquals(0, angler1.getFishCaught());
	}

}
