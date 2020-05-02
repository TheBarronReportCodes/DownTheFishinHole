package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * tests the catchFish method of the Small Fish object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class SmallFishWhenCatchFish {

	/**
	 * Test Small Fish Constructor 0 parameters show
	 * "small fish with 50 fish in the school"
	 * BUT when catchFish()
	 * "small fish with 50 fish in the school" 
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewSmallFishWhenCatchFishShouldHave50NumberOfFishInSchool() {
		FishType fish1 = new SmallFish();
		fish1.catchFish();
		assertEquals("small fish with 50 fish in the school", fish1.toString());
	}
	
	/**
	 * Test Small Fish Constructor 0 parameters show
	 * "small fish with 100 fish in the school" 
	 * BUT when catchFish() and  catchFish()
	 * "small fish with 0 fish in the school"
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewSmallFishWhenCatchFishTwiceShouldHave0NumberOfFishInSchool() {
		FishType fish2 = new SmallFish();
		fish2.catchFish();
		fish2.catchFish();
		assertEquals("small fish with 0 fish in the school", fish2.toString());
	}

}
