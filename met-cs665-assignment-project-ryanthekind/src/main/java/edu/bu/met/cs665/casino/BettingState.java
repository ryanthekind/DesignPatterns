package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns 
 * Date: 4/27/2022 Assignment: 
 * Final Project Description: This
 * BettingState class is one of 3 concrete 
 * classes for the State Pattern. Here
 * is the logic for the betting phase.
 *
 */

public class BettingState implements State {

  Person player; // HAS-A relationship

  public BettingState(Person player) {
    this.player = player;
  }

  @Override
  public void placeChips() {
    System.out.println("Welcome to the table! Your bet was accepted.");
    this.player.setState(player.getBettingState());
  }

  @Override
  public void play() {
    System.out.println("Here are your cards");
    this.player.setState(player.getPlayingState());
  }

  @Override
  public void fold() {
    System.out.println("You haven't got your cards yet.");

  }

  @Override
  public void leaveTable() {
    System.out.println("Sorry, you can't leave after we accepted your bet");

  }

  public String toString() {
    return "This is the BETTING cs665.blackjack.";
  }

}
