package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns 
 * Date: 5/1/2022 
 * Assignment: Final Project 
 * Description: The Card class provides
 * the logic to create a deck of cards
 * with a value and a suit.
 *
 */


public class Card {

  public Value value;
	public Suit suit;
	
	public Card(Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	
	
	public String toString() {
	  return value + " of " + suit;
	}
	
}

