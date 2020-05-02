package edu.westga.cs6312.fishing.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.fishing.model.Angler;

/**
 * tests the payToFish method of the Angler object
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class AnglerWhenPayToFish {
	
	/**
	 * Test Angler Constructor 0 parameters show
	 * getMoneyUnits = 100 BUT when payToFish(0)
	 * getMoneyUnits = 100
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerWhenPayToFish0ShouldHave100GetMoneyUnits() {
		Angler angler1 = new Angler();
		angler1.payToFish(0);
		assertEquals("The Angler has 100 units and has caught 0 fish", angler1.toString());
	}

	/**
	 * Test Angler Constructor 0 parameters show
	 * getMoneyUnits = 100 BUT when payToFish(1)
	 * getMoneyUnits = 99
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerWhenPayToFish1ShouldHave99GetMoneyUnits() {
		Angler angler1 = new Angler();
		angler1.payToFish(1);
		assertEquals("The Angler has 99 units and has caught 0 fish", angler1.toString());
	}
	
	/**
	 * Test Angler Constructor 0 parameters show
	 * getMoneyUnits = 100 BUT when payToFish(50)
	 * getMoneyUnits = 50
	 * Sunny Day value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerWhenPayToFish50ShouldHave50GetMoneyUnits() {
		Angler angler2 = new Angler();
		angler2.payToFish(50);
		assertEquals("The Angler has 50 units and has caught 0 fish", angler2.toString());
	}
	
	/**
	 * Test Angler Constructor 0 parameters show
	 * getMoneyUnits = 100 BUT when payToFish(100)
	 * getMoneyUnits = 0
	 * Boundary value test
	 */
	@Test
	public void test0ParameterConstructorNewAnglerWhenPayToFish100ShouldHave0GetMoneyUnits() {
		Angler angler3 = new Angler();
		angler3.payToFish(100);
		assertEquals("The Angler has 0 units and has caught 0 fish", angler3.toString());
	}

}
