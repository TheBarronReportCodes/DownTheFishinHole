package edu.westga.cs6312.fishing.controller;

import edu.westga.cs6312.fishing.model.GameBoard;
import edu.westga.cs6312.fishing.view.FishingTUI;

/**
 * Executes the user interface for the application
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class FishingDriver {

	/**
	 * Entry point into application
	 * 
	 * @param args
	 * 
	 * not used
	 */
	public static void main(String[] args) {
		GameBoard gameBoardObject = new GameBoard();
		
		FishingTUI fishingObject = new FishingTUI(gameBoardObject);
		fishingObject.run();
	}

}
