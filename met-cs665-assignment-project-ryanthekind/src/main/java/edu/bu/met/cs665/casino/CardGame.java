package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 4/30/2022
 * Assignment: Final Project
 * Description: This abstract CardGame class is a part of
 * the Bridge design Pattern. This class delegates work.
 *
 */

public abstract class CardGame {

  protected Dealer dealer;
  
  public CardGame(Dealer dealer) {
    this.dealer = dealer;
  }
  
  /**
   * this method determines which card game 
   * the user wants to play.
   */
  public abstract void gameType();
}
