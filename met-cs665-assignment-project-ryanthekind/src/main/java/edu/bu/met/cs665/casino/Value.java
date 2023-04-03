package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 3/29/22
 * Assignment: Term Project
 * Description: The Value enum provides the program a card's 
 * value from 1 - 11 that you find in a deck of cards.
 *
 */

public enum Value {

  TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), 
	SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10),
	QUEEN(10), KING(10), ACE(11);
  
	private int score;
	
	private Value(int score) {
		this.score = score;
	}

  public int getScore() {
    return score;
  }

	
	
}
