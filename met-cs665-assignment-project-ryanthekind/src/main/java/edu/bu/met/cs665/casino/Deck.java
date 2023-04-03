package edu.bu.met.cs665.casino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * Name: Ryan Burns 
 * Date: 5/1/2022 
 * Assignment: Final Project 
 * Description: The Deck class provides
 * the logic to create a deck of cards
 * with the use of an ArrayList.
 *
 */

public class Deck {
  
	ArrayList<Card> cards;
	
	// constructor
	public Deck() {
		this.cards = new ArrayList<Card>();
		
	} // end of constructor
	
	/**
	 * This method builds the deck of cards using an enhanced for loop that iterates
	 * over the suit and values and stores the elements into the cards ArrayList
	 */
	public void buildDeck() {
	  for(Suit suit : Suit.values()) {
      for(Value value : Value.values()) {
        //System.out.println(value + " of " + suit +  " is worth " + value.score); 
        Card cardToAdd = new Card(value, suit);
        cards.add(cardToAdd);
      } // end of inner for loop
    } // end of outer for loop
    
	}
	
	
	// Shuffle Deck instance method
	/**
	 * This method shuffles the deck created
	 */
	public void suffleDeck() {

	  Collections.shuffle(cards);
//	  System.out.println("Deck Shuffled\n");

	  
	   for(int i = 0; i < cards.size(); i++) {
	   //System.out.println(cards.get(i));
	    }
	} // end of suffleDeck()
	
	
	
	/***************************************************************************************
	*    Title: How to Program Console Blackjack in Java
	*    Author: Kevin O
	*    Date: 4/5/22
	*    Code version: 1 - used lines 74 - 97
	*    Availability: https://www.youtube.com/watch?v=xLhgqPUHoVs&t=403s
	*
	***************************************************************************************/
	
	public String toString() {
	  String cardOutput = "";
	  for(Card aCard : this.cards) {
	    cardOutput += "\n" + aCard.toString();
	  }
	  return cardOutput;
	}
	
	public void removeCard(int i) {
	  this.cards.remove(i);
	}
	
	public Card getCard(int i) {
	  return this.cards.get(i);
	}
	
	public void addCard(Card addCard) {
	  this.cards.add(addCard);
	}
	
	public void moveAllToDeck(Deck moveTo) {
    int thisDeckSize = this.cards.size();
    
    // put cards into moveTo Deck
    for(int i = 0; i < thisDeckSize; i++) {
      moveTo.addCard(this.getCard(i));
    }
    
    //empty out deck
    for(int i = 0; i < thisDeckSize; i++) {
      this.removeCard(0);
    }
    
  }
	
	//draw from deck
	public void draw(Deck comingFrom) {
	  this.cards.add(comingFrom.getCard(0));
	  comingFrom.removeCard(0);
	}
	
	
	/**
	 * This method calculates the value in your hand
	 * @return
	 */
	public int getHandValue() {
	  int total = 0;
	  int aces = Value.ACE.getScore();
	  
	  for(int i = 0; i < cards.size(); i++) {
	    //System.out.println(this.cards.get(i).value.score);
	    total += this.cards.get(i).value.getScore();
	    
	    if(total > 10) {
	      aces = 1;
	    }
	  }
	  
	  return total;
	}
	
} // end of class
