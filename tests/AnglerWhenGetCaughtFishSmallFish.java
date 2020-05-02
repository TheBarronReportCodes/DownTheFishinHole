package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;
import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * tests the catchFish method of the Angler object when fishing for small fish
 * 
 * @author Jordan Barron
 * @version February 16th, 2020
 *
 */
public class AnglerWhenGetCaughtFishSmallFish {

	/**
	 * Test Angler Constructor 0 parameters and small fish 0 parameter
	 * getCaughtFish = 0
	 * BUT 
	 * When Angler fishes for small fish he catches 50
	 * SO 
	 * after fishing :
	 * getCaughtFish = 50
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewSmallFishWhenCatchFishSmallFishShouldHave50FishCaught() {
		Angler angler1 = new Angler();
		FishType fish1 = new SmallFish();		
		angler1.catchFish(fish1.catchFish());
		assertEquals(50, angler1.getFishCaught());
	}
	
	/**
	 * Test Angler Constructor 0 parameters and small fish 0 parameter
	 * getCaughtFish = 0
	 * BUT 
	 * When Angler fishes for small fish twice he catches 100
	 * SO 
	 * after fishing :
	 * getCaughtFish = 100
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewSmallFishWhenCatchFishSmallFishTwiceShouldHave100FishCaught() {
		Angler angler2 = new Angler();
		FishType fish2 = new SmallFish();		
		angler2.catchFish(fish2.catchFish());
		angler2.catchFish(fish2.catchFish());
		assertEquals(100, angler2.getFishCaught());
	}

}
