# DownTheFishinHole
Java application that makes use of ArrayLists, Abstraction, and Polymorphism to create a textual based game

###Task

The game will be a one player game where the player will act as the angler and
will be able to navigate through different fishing holes.  Each fishing hole can contain at most one school
of one type of fish.  When the angler enters a fishing hole, they can choose to fish, in which case money
units will be deducted as a fee and a certain number of fish will be caught and removed from the school.  
The game ends when the angler chooses to quit.


##Criteria

MVC standard, 
Model classes to control the Angler, FishingHole, GameBoard, abstract class FishType and subclasses of SmallFish and BigFish,
Test classes to JUnit test functionality and logic,
View classes to control the textual user interface,
Controller class to control execution of program


##Summary of Tech Stack The only tech stack used here was Java out of the box. Core concepts used were ArrayLists to store the fishing holes,
Abstraction to define the different types of fish, and polymorphhism so that the types of fish inherit from the abstract fish class

##Functionality The user will interact with the application using a console‐based, textual user interface (TUI).  
This interface is menu driven, where each integer entered executes a specific part of the application
