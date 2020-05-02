package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishingHole;

/**
 * tests the getLocation method of a Fishing Hole Object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class FishingHoleWhenGetLocation {

	/**
	 * Test FishingHole Constructor 1 parameters show
	 * getLocation = "Fishing hole at [0]"
	 * Boundary value test
	 */
	@Test
	public void test1ParameterConstructorNewFishingHoleWhen0InParameterShouldHave0GetLocation() {
		FishingHole fishingHole = new FishingHole(0);
		assertEquals("Fishing hole at [0]", fishingHole.getLocation());
	}
	
	/**
	 * Test FishingHole Constructor 1 parameters show
	 * getLocation = "Fishing hole at [5]"
	 * 'Sunny Day' value test
	 */
	@Test
	public void test1ParameterConstructorNewFishingHoleWhen5InParameterShouldHave5GetLocation() {
		FishingHole fishingHole = new FishingHole(5);
		assertEquals("Fishing hole at [5]", fishingHole.getLocation());
	}
	
	/**
	 * Test FishingHole Constructor 1 parameters show
	 * getLocation = "Fishing hole at [11]"
	 * 'Sunny Day' value test
	 */
	@Test
	public void test1ParameterConstructorNewFishingHoleWhen11InParameterShouldHave11GetLocation() {
		FishingHole fishingHole = new FishingHole(11);
		assertEquals("Fishing hole at [11]", fishingHole.getLocation());
	}

}
