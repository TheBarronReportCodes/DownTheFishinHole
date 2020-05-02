package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;
import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * tests the payToFish and catchFish method of the Angler object when fishing for small fish
 * 
 * @author Jordan Barron
 * @version February 16th, 2020
 *
 */
public class AnglerWhenPayToFishGetFishCaughtSmallFish {

	/**
	 * Test Angler Constructor 0 parameters and small fish 0 parameter
	 * "The Angler has 100 units and has caught 0 fish"
	 * BUT 
	 * When Angler fishes for small fish it costs 25 units and they catch 50 fish
	 * SO 
	 * after fishing :
	 * "The Angler has 75 units and has caught 50 fish"
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewSmallFishWhenFishSmallFishShouldHave75GetMoneyUnits50FishCaught() {
		Angler angler1 = new Angler();
		FishType fish1 = new SmallFish();		
		angler1.payToFish(fish1.costToFish());
		angler1.catchFish(fish1.catchFish());
		assertEquals("The Angler has 75 units and has caught 50 fish", angler1.toString());
	}	
	
	/**
	 * Test Angler Constructor 0 parameters and small fish 0 parameter
	 * "The Angler has 100 units and has caught 0 fish"
	 * BUT 
	 * When Angler fishes for small fish twice it costs 50 units and they catch 100 fish
	 * SO 
	 * after fishing :
	 * "The Angler has 50 units and has caught 100 fish"
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewSmallFishWhenFishSmallFishTwiceShouldHave50GetMoneyUnits100FishCaught() {
		Angler angler2 = new Angler();
		FishType fish2 = new SmallFish();		
		angler2.payToFish(fish2.costToFish());
		angler2.catchFish(fish2.catchFish());
		angler2.payToFish(fish2.costToFish());
		angler2.catchFish(fish2.catchFish());
		assertEquals("The Angler has 50 units and has caught 100 fish", angler2.toString());
	}

}
