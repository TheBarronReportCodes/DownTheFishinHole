package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * tests the catchFish method of the Angler object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class AnglerWhenCatchFish {
	
	/**
	 * Test Angler Constructor 0 parameters show
	 * getFishCaught = 0 BUT when catchFish(0)
	 * getFishCaught = 0
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerWhenCatchFish0ShouldHave0GetFishCaught() {
		Angler angler1 = new Angler();
		angler1.catchFish(0);
		assertEquals("The Angler has 100 units and has caught 0 fish", angler1.toString());
	}

	/**
	 * Test Angler Constructor 0 parameters show
	 * getFishCaught = 0 BUT when catchFish(1)
	 * getFishCaught = 1
	 * Sunny Day value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerWhenCatchFish1ShouldHave1GetFishCaught() {
		Angler angler1 = new Angler();
		angler1.catchFish(1);
		assertEquals("The Angler has 100 units and has caught 1 fish", angler1.toString());
	}
	
	/**
	 * Test Angler Constructor 0 parameters show
	 * getFishCaught = 0 BUT when catchFish(50) and catchFish(50)
	 * getFishCaught = 100
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerWhenCatchFish100ShouldHave100GetFishCaught() {
		Angler angler2 = new Angler();
		angler2.catchFish(50);
		angler2.catchFish(50);
		assertEquals("The Angler has 100 units and has caught 100 fish", angler2.toString());
	}
}
