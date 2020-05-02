package edu.westga.cs6312.fishing.view;

import java.util.Scanner;

import edu.westga.cs6312.fishing.model.GameBoard;

/**
 * user interface class for application
 * 
 * @author Jordan Barron
 * @version February 15th, 2020
 *
 */
public class FishingTUI {
	private GameBoard gameBoardObject;
	private Scanner scan;
	
	/**
	 * 1 parameter constructor that creates a new fishing game for the user to interact with
	 * @param gameBoardObject An instance of a game
	 */
	public FishingTUI(GameBoard gameBoardObject) {
		this.gameBoardObject = gameBoardObject;
		this.scan = new Scanner(System.in);
	}
	
	/**
	 * runs different tasks of the application
	 */
	public void run() {
		System.out.println("Welcome to Down by the Fishin' Hole \n");
		int userChoice; 
		do {
			this.displayMenu();
			userChoice = this.getIntegerFromUser("Enter your choice: ");
			switch (userChoice) {
				case 1:
					this.displayCurrentFishingHole();
					break;
				case 2:
					this.displayAnglerInformation();
					break;
				case 3:
					this.displayGameBoard();
					break;
				case 4:
					this.move();
					break;
				case 5:
					this.fish();
					break;
				case 9:
					this.quit();
					break;
				default:
					System.out.println("That's not a valid choice. Please try again \n");
					break;
			}
		} while (userChoice != 9);
	}
	
	/**
	 * Displays the different options for the user to choose and interact with
	 * Helper method for run()
	 */
	private void displayMenu() {
		System.out.println("1 - Describe current fishing hole");
		System.out.println("2 - Describe angler");
		System.out.println("3 - Describe game board");
		System.out.println("4 - Move");
		System.out.println("5 - Fish the fishing hole");
		System.out.println("9 - Quit");
	}
	
	/**
	 * Acquires the users input
	 * @param message The message we want displayed to the user
	 * @return userOptionInt Returns the string enter by the user in int form
	 * Helper method for run()
	 */
	private int getIntegerFromUser(String message) {	
		System.out.println(message);
		String userOptionString = this.scan.nextLine();
		int userOptionInt = Integer.parseInt(userOptionString);
		return userOptionInt;
	}
	
	/**
	 * Prints the toString of the Hole the Angler is currently at
	 * Helper method for run()
	 */
	private void displayCurrentFishingHole() {
		System.out.println(this.gameBoardObject.getCurrentLocation().toString());
		System.out.println();
	}
	
	/**
	 * Prints the Angler's toString
	 * Helper method for run()
	 */
	private void displayAnglerInformation() {
		System.out.println(this.gameBoardObject.getAnglerObject().toString());
		System.out.println();
	}
	
	/**
	 * Prints all pieces of the GameBoard
	 * Helper method for run()
	 */
	private void displayGameBoard() {
		System.out.println(this.gameBoardObject.toString());
		System.out.println();
	}
	
	/**
	 * Allow User ability to move Angler up or down a fishing hole
	 * Helper method for run()		
	 */
	private void move() {
		this.displayMoveMenu();
		
		int userChoice; 
		userChoice = this.getIntegerFromUser("Enter direction you would like to move: ");
		switch (userChoice) {
			case 1:
				this.simulateMoveUp();
				break;
			case 2:
				this.simulateMoveDown();
				break;
			default:
				System.out.println("Invalid direction number. Returning to main menu \n");
				break;
		}
	}
	
	/**
	 * Displays the different Move options for the user to choose and interact with
	 * Helper method for move()
	 */
	private void displayMoveMenu() {
		System.out.println("1 - Up");
		System.out.println("2 - Down");
	}
	
	/**
	 * simulates the angler moving up a fishing hole
	 * Helper method for move()
	 */
	private void simulateMoveUp() {
		this.gameBoardObject.moveUp();
		System.out.println(this.gameBoardObject.getCurrentLocation().toString());
		System.out.println();
	}
	
	/**
	 * simulates the angler moving down a fishing hole
	 * Helper method for move()
	 */
	private void simulateMoveDown() {
		this.gameBoardObject.moveDown();
		System.out.println(this.gameBoardObject.getCurrentLocation().toString());
		System.out.println();
	}
	
	/**
	 * simulates the angler fishing (paying to fish and catching fish)
	 * Helper method for move()
	 */
	private void fish() {
		if (this.gameBoardObject.getCurrentLocation().getFish() == null) {
			System.out.println("No Fish Present \n");
		} else {
			this.anglerPayingToFish();
			this.anglerCatchingFish();
			this.displayAnglerInformation();
		}
	}
	
	/**
	 * simulates the angler paying to fish a fish of a specific kind
	 * Helper method for fish()
	 */
	private void anglerPayingToFish() {
		int fishCost = this.gameBoardObject.getCurrentLocation().getFish().costToFish();
		this.gameBoardObject.getAnglerObject().payToFish(fishCost);
	}
	
	/**
	 * simulates the angler catching a fish of a specific kind
	 * the amount of fish caught is the amount of fish removed
	 * remaining number of fish will be updated
	 * Helper method for fish()
	 */
	private void anglerCatchingFish() {
		int fishCaught = this.gameBoardObject.getCurrentLocation().getFish().catchFish();
		this.gameBoardObject.getAnglerObject().catchFish(fishCaught);
		
	}
	
	/**
	 * Displays a message wishing the user goodbye
	 * Helper method for run()
	 */
	private void quit() {
		System.out.println("Thank you for playing. Goodbye! \n");
	}

}
