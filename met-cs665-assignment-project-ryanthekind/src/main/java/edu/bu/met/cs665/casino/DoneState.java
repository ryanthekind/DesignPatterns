package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 4/27/2022
 * Assignment: Final Project
 * Description: This DoneState class is one of 3 concrete classes for the 
 * State Pattern. Here is the logic for the betting phase.
 *
 */

public class DoneState implements State {

  Person player; // HAS-A relationship
  
  public DoneState(Person player) {
    this.player = player;
  }
  
  @Override
  public void placeChips() {
    System.out.println("You can't bet anymore, you left the table.");
  }

  @Override
  public void play() {
    System.out.println("the game is over");
  }

  @Override
  public void fold() {
    System.out.println("Sorry you have no cards to fold.");
    this.player.setState(player.getDoneState());
  }

  @Override
  public void leaveTable() {
    System.out.println("Thank you for playing!");
    this.player.setState(player.getDoneState());
  }
  
  public String toString() {
    return "This is the DONE cs665.blackjack.";
  }



  
}
