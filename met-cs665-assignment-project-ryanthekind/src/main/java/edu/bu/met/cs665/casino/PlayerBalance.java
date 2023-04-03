package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 5/1/2022
 * Assignment: Final Project
 * Description: The PlayerBalance class is a part of
 * the Facade Pattern that manages the player's money
 * they can play with.
 *
 */

public class PlayerBalance {

  private double playerWallet; 
  private double playerBet;


  
  public double getPlayerWallet() {
    return playerWallet;
  }

  public double getPlayerBet() {
    return playerBet;
  }


  public void setPlayerWallet(double playerWallet) {
    this.playerWallet = playerWallet;
  }

  public void setPlayerBet(double playerBet) {
    this.playerBet = playerBet;
  }

  // method if player looses hand
  public void lost(double playerBet) {
    playerWallet -= playerBet;
  }
  
  public void win(double playerBet) {
    playerWallet += playerBet;
  }

  
  /**
   * This method only works if there is a value in the playerWallet variable.
   */
  public boolean playerHasEnoughMoney(double cashToBet) {
    
    if(cashToBet > getPlayerWallet()){
      System.out.println("Sorry, not enough funds to gamble");
      System.out.println("You have: " + getPlayerWallet());
      
      return false;
    } else {
      System.out.println("Good to play");
      
      return true;
    }
    
  }
}
