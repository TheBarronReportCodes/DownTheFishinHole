package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;
import edu.westga.cs6312.fishing.model.FishType;
import edu.westga.cs6312.fishing.model.SmallFish;

/**
 * tests the payToFish method of the Angler object when fishing for small fish
 * 
 * @author Jordan Barron
 * @version February 16th, 2020
 *
 */
public class AnglerWhenPayToFishSmallFish {

	/**
	 * Test Angler Constructor 0 parameters and small fish 0 parameter
	 * getMoneyUnits = 100
	 * BUT 
	 * When Angler fishes for small fish it costs 25 units
	 * SO 
	 * after fishing :
	 * getMoneyUnits = 75
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewSmallFishWhenPayToFishSmallFishShouldHave75GetMoneyUnits() {
		Angler angler1 = new Angler();
		FishType fish1 = new SmallFish();		
		angler1.payToFish(fish1.costToFish());
		assertEquals(75, angler1.getMoneyUnits());
	}
	
	/**
	 * Test Angler Constructor 0 parameters and small fish 0 parameter
	 * getMoneyUnits = 100
	 * BUT 
	 * When Angler fishes for small fish twice it costs 50 units
	 * SO 
	 * after fishing :
	 * getMoneyUnits = 50
	 * Sunny Day value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewSmallFishWhenPayToFishSmallFishTwiceShouldHave50GetMoneyUnits() {
		Angler angler2 = new Angler();
		FishType fish2 = new SmallFish();		
		angler2.payToFish(fish2.costToFish());
		angler2.payToFish(fish2.costToFish());
		assertEquals(50, angler2.getMoneyUnits());
	}
	
	/**
	 * Test Angler Constructor 0 parameters and small fish 0 parameter
	 * getMoneyUnits = 100
	 * BUT 
	 * When Angler fishes for small fish four times it costs 100 units
	 * SO 
	 * after fishing :
	 * getMoneyUnits = 0
	 * Sunny Day value test
	 */
	@Test
	public void test0ParameterConstructorsNewAnglerNewSmallFishWhenPayToFishSmallFishFourTimesShouldHave0GetMoneyUnits() {
		Angler angler3 = new Angler();
		FishType fish3 = new SmallFish();		
		angler3.payToFish(fish3.costToFish());
		angler3.payToFish(fish3.costToFish());
		angler3.payToFish(fish3.costToFish());
		angler3.payToFish(fish3.costToFish());
		assertEquals(0, angler3.getMoneyUnits());
	}

}
