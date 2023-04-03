package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 4/27/2022
 * Assignment: Final Project
 * Description: This PlayingState class is one of 3 concrete classes for the 
 * State Pattern. Here is the logic for the betting phase.
 *
 */

public class PlayingState implements State {

  Person player; // HAS-A relationship
  
  public PlayingState(Person player) {
    this.player = player;
  }
  
  @Override
  public void placeChips() {
    System.out.println("You cannot add chips at this time.");
  }

  @Override
  public void play() {
    System.out.println("You're playing!");
    this.player.setState(player.getPlayingState());
  }

  @Override
  public void fold() {
    System.out.println("Sorry you didn't like your hand.");
    this.player.setState(player.getDoneState());
  }

  @Override
  public void leaveTable() {
    System.out.println("Sorry, you can't leave the table while in play");
    
  }
  
  public String toString() {
    return "This is the Playing cs665.blackjack.";
  }



  
}
