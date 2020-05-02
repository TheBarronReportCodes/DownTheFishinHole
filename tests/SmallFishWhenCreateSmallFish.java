package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * tests the creation of a Small Fish Object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class SmallFishWhenCreateSmallFish {

	/**
	 * Test Small Fish Constructor 0 parameters show
	 * "small fish with"
	 * numberOfFishInSchool = 100
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewSmallFishShouldHaveSmallFishWith100FishInTheSchool() {
		FishType fish1 = new SmallFish();
		assertEquals("small fish with 100 fish in the school", fish1.toString());
	}

}
