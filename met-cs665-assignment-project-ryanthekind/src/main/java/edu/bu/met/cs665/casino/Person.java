package edu.bu.met.cs665.casino;

/**
 * Name: Ryan Burns
 * Date: 4/27/2022
 * Assignment: Final Project
 * Description: This Person class is the context class for the 
 * State Pattern. Here I will create the rules that the State
 * interface will delegate.
 *
 */

public class Person {

  private State bettingState;
  private State playingState;
  private State doneState;
  private State state;
  
  /**
   * This constructor
   * allows for the State Pattern
   * to be implemented.
   */
  public Person() {
    this.bettingState = new BettingState(this);
    this.playingState = new PlayingState(this);
    this.doneState = new DoneState(this);    
    this.state = bettingState;
  }
  
  public void placeChips() {
    state.placeChips();
  }
  
  public void play() {
    state.play();
  }
  
  public void fold() {
    state.fold();
  }
  
  public void leaveTable() {
    state.leaveTable();
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getBettingState() {
    return bettingState;
  }

  public State getPlayingState() {
    return playingState;
  }

  public State getDoneState() {
    return doneState;
  }
  
  
  
}
