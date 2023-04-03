package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 4/27/2022
 * Assignment: Final Project
 * Description: I am implementing the State Pattern in my Blackjack game
 * to make the app more flexible. The state pattern allows you to easily
 * add or remove abstract methods from concrete classes.
 *
 */

public interface State {

  void placeChips();
  
  void play();
  
  void fold();
  
  void leaveTable();
}
