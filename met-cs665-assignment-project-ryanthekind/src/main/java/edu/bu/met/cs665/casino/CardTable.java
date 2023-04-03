package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 4/30/2022
 * Assignment: Final Project
 * Description: This CardTable class is a concrete 
 * implementation of the Bridge Pattern.
 *
 */

public class CardTable implements Dealer {

  @Override
  public void deal() {
    System.out.println(" is being played at this table.");
    
  }

  
  
}
