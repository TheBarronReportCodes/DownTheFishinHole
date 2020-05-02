package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * tests the costToFish method of the Large Fish object
 * 
 * @author Jordan Barron
 * @version February 16th, 2020
 *
 */
public class LargeFishWhenGetCostToFish {
	
	/**
	 * Test Large Fish Constructor 0 parameters show
	 * costTofish = 50
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewLargeFishWhenCostToFishShouldHave50() {
		FishType fish1 = new LargeFish();
		assertEquals(50, fish1.costToFish());
	}

}
