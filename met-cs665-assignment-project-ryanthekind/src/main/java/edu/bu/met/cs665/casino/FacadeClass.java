package edu.bu.met.cs665.casino;

import java.util.Scanner;

/**
 * Name: Ryan Burns
 * Date: 5/1/2022
 * Assignment: Final Project
 * Description: The FacadeClass class is a part of
 * the Facade Pattern. This patter hides the
 * complexity of the cash management and game 
 * logic from the client.
 */

public class FacadeClass {
  
  WelcomeToGame welcomePlayer; //HAS-A relationship
  PlayerBalance playerFunds;
  Deck deck;
  
  // this was the only way I could get this to work
  Deck playerHand = new Deck();
  Deck dealerHand = new Deck();
  
  /**
   * This constructor
   * welcomes a player
   * creates a new deck and a new player
   * fund balance. Also builds
   * a deck and shuffles the deck.
   */
  public FacadeClass() {
  
    welcomePlayer = new WelcomeToGame();
    playerFunds = new PlayerBalance();
    deck = new Deck();
    deck.buildDeck();
    deck.suffleDeck();
  }
  

  /**
   * This method manages the player's 
   * wallet and checks for incorrect 
   * inputs.
   */
  public void playerWallet(double playerWallet) {
    playerFunds.setPlayerWallet(playerWallet);
    
    if(playerFunds.getPlayerWallet() <= 0) {
      System.out.println("cannot have zero or a negative number.");
    }
    else {
      System.out.printf("You have $%.2f to gamble%n", playerFunds.getPlayerWallet());
      //System.out.println("How much do you want to bet?");
    }
  }
  
  /**
   * This method allows the player
   * to place a bet.
   */
  public void placeBet(double playerBet) {
    
    System.out.println(playerFunds.getPlayerWallet());
    if(playerFunds.playerHasEnoughMoney(playerBet)) {
      System.out.printf("Your $%.2f bet was accepted%n", playerBet);
//      playerFunds.setPlayerBet(playerBet);
    } 
    else {
      System.out.println("You don't have enough money to play.");
    }
  }
  
  /**
   * The startPlaying method contains
   * a scenario where the player wishes
   * to play a round of blackjack.
   * 
   * The while loop on line 111 was inspired by code I reviewed 
   * from https://www.youtube.com/watch?v=xLhgqPUHoVs&t=403s.
   */
  public void startPlaying(double playerWallet, double playerBet) {
    
    if(playerWallet > 0) {
      System.out.println("playerWallet: " + playerWallet);
      System.out.println("playerBet: " + playerBet);
      //System.out.println(playerBet);
      
    }
    else {
      System.out.println("can't enter zero or less");
    }
    
    boolean endRound = false;
    
    playerHand.draw(deck);
    playerHand.draw(deck);

    dealerHand.draw(deck);
    dealerHand.draw(deck);
    
    
    
    while(true){
      System.out.println("Your Hand: ");
      System.out.println(playerHand.toString());
      System.out.println("your value " + playerHand.getHandValue());

      System.out.println("Dealer: ");
      // System.out.println(dealerHand.toString());
      System.out.println("Dealer's hand: " + dealerHand.getCard(0).toString() + ", CARD FLIPPED");

      

      System.out.println("Do you want to hit or stay?");

      Scanner myObj = new Scanner(System.in);
      String playerResponse = myObj.nextLine();

      System.out.println(playerResponse);

      // Player hits
      if (playerResponse.equalsIgnoreCase("hit")) {
        playerHand.draw(deck);
        System.out.println("Dealer hands you a: " + playerHand.getCard(playerHand.cards.size() - 1).toString());
        //System.out.println(playerHand.toString());

        // if over 21
        if (playerHand.getHandValue() > 21) {
          System.out.println(playerHand.getHandValue());
          System.out.println("Sorry you Busted");
          playerWallet -= playerBet;
          endRound = true;
          break;
        }
      } if (playerResponse.equals("stay")) {
        break;
      } 
    }
    
    // Show dealer cards
    System.out.println("Dealer Hand:  "+ dealerHand.toString());
    System.out.println( "Dealer Value: " + dealerHand.getHandValue());
    
    // dealer hits at 16 and stands at 17
    if((dealerHand.getHandValue() < 17) && endRound == false) {
      dealerHand.draw(deck);
      System.out.println("Dealer Draws: " + 
      dealerHand.getCard(dealerHand.cards.size()- 1).toString());
    }
    
    // check if dealer busted
    if(dealerHand.getHandValue() > 21 && endRound == false) {
      System.out.println("Dealer Busted! You Win!");
      playerWallet += playerBet;
      endRound = true;
    }
    
    System.out.println("Dealer's hand is: " + dealerHand.getHandValue());
    if((dealerHand.getHandValue() > 21) && endRound == false) {
      System.out.println("Dealer Busts, you Win!");
      playerWallet += playerBet;
      endRound = true;
    }
    
    // check for push
    if((playerHand.getHandValue() == dealerHand.getHandValue() && endRound == false)) {
      System.out.println("push");
      endRound = true;
    }
    
    if((playerHand.getHandValue() > dealerHand.getHandValue()) && endRound == false) {
      System.out.println("you win the hand");
      playerWallet += playerBet;
      endRound = true;
    }
    else if (endRound == false) {
      System.out.println("You lost the hand");
      playerWallet -= playerBet;
      endRound = true;
    }
    
    playerHand.moveAllToDeck(deck);
    dealerHand.moveAllToDeck(deck);
    System.out.println("End of Hand");
    
    System.out.println("$"+ playerWallet);
    
    
  } // end of startplaying method
 
  
  
} // end of facade class
