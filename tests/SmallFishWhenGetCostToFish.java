package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * tests the costToFish method of the Small Fish object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class SmallFishWhenGetCostToFish {

	/**
	 * Test Small Fish Constructor 0 parameters show
	 * costTofish = 25
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewSmallFishWhenCostToFishShouldHave25() {
		FishType fish1 = new SmallFish();
		assertEquals(25, fish1.costToFish());
	}

}
