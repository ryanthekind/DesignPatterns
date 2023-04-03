package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns 
 * Date: 4/30/2022 
 * Assignment: Final Project 
 * Description: The Blackjack class is a part of the 
 * Bridge design Pattern and is also the refined 
 * abstraction.
 *
 */

public class Blackjack extends CardGame {

  private String gameName = "Blackjack";

  public Blackjack(Dealer dealer) {
    super(dealer);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void gameType() {
    System.out.print(getGameName());
    dealer.deal();

  }

  public String getGameName() {
    return gameName;
  }

}
