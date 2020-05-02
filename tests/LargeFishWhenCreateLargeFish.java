package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * tests the creation of a Large Fish Object
 * 
 * @author Jordan Barron
 * @version February 16th, 2020
 *
 */
public class LargeFishWhenCreateLargeFish {

	/**
	 * Test Large Fish Constructor 0 parameters show
	 * "large fish with"
	 * numberOfFishInSchool = 50
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewLargeFishShouldHaveLargeFishWith50FishInTheSchool() {
		FishType fish1 = new LargeFish();
		assertEquals("large fish with 50 fish in the school", fish1.toString());
	}

}
