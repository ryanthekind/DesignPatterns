package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 5/1/2022
 * Assignment: Final Project
 * Description: The Poker class is a part of
 * the Bridge design Pattern and is also the refined abstraction.
 *
 */

public class Poker extends CardGame {
  
  private String gameName = "Poker";
  
  public Poker(Dealer dealer) {
    super(dealer);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void gameType() {
   System.out.print(gameName);
   dealer.deal();
    
  }
  
  public String getGameName() {
    return gameName;
  }


  
}
