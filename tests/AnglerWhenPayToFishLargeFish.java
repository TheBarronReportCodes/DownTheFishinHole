package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;
import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.LargeFish;

/**
 * tests the payToFish method of the Angler object when fishing for large fish
 * 
 * @author Jordan Barron
 * @version February 16th, 2020
 *
 */
public class AnglerWhenPayToFishLargeFish {

	/**
	 * Test Angler Constructor 0 parameters and large fish fish 0 parameter
	 * getMoneyUnits = 100
	 * BUT 
	 * When Angler fishes for large fish it costs 50 units
	 * SO 
	 * after fishing :
	 * getMoneyUnits = 50
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewLargeFishWhenPayToFishLargeFishShouldHave50GetMoneyUnits() {
		Angler angler1 = new Angler();
		FishType fish1 = new LargeFish();		
		angler1.payToFish(fish1.costToFish());
		assertEquals(50, angler1.getMoneyUnits());
	}
	
	/**
	 * Test Angler Constructor 0 parameters and large fish fish 0 parameter
	 * getMoneyUnits = 100
	 * BUT 
	 * When Angler fishes for large fish twice it costs 100 units
	 * SO 
	 * after fishing :
	 * getMoneyUnits = 0
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewLargeFishWhenPayToFishLargeFishTwiceShouldHave0GetMoneyUnits()  {
		Angler angler1 = new Angler();
		FishType fish1 = new LargeFish();		
		angler1.payToFish(fish1.costToFish());
		angler1.payToFish(fish1.costToFish());
		assertEquals(0, angler1.getMoneyUnits());
	}

}
