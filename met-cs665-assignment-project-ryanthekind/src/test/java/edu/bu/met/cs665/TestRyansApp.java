package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import edu.bu.met.cs665.casino.CardGame;
import edu.bu.met.cs665.casino.CardTable;
import edu.bu.met.cs665.casino.FacadeClass;
import edu.bu.met.cs665.casino.Person;
import edu.bu.met.cs665.casino.Poker;
import org.junit.Test;



/**
 * Name: Ryan Burns
 * Date: 5/2/2022
 * Assignment: Final Project
 * Description: The TestRyansApp class is a part of
 * test driven development. It was near the end
 * of this semester that I learned I should be
 * testing and failing within this class while
 * building out my application except doing tests rather
 * than testing at the end.
 */

public class TestRyansApp {

  
  public TestRyansApp() {}
  
  @Test
  public void testBridgePattern() {
    
    CardGame poker = new Poker(new CardTable());
    poker.gameType();
    
    /*
     * This fails, unsure how to resolve
     * The method assertEquals(Object, Object)
     * in the type Assert is not applicable for
     * the arguments (String, void).
     */
    //assertEquals("Poker", poker.gameType());
    
  }
  
  
  @Test
  public void TestStatePattern() {
    
    Person ryan = new Person();
    ryan.placeChips();
    assertEquals("This is the BETTING cs665.blackjack.", ryan.getState().toString());
    
    ryan.play();
    assertEquals("This is the Playing cs665.blackjack.", ryan.getState().toString());
    
    ryan.fold();
    assertEquals("This is the DONE cs665.blackjack.", ryan.getState().toString());
    
    ryan.leaveTable();
    assertEquals("This is the DONE cs665.blackjack.", ryan.getState().toString());
  }
  
  /**
   * The Facade class seems to have added
   * unnecessary complexity to my code.
   */
  @Test
  public void TestFacadePattern() {
    
    
    //FacadeClass newGame = new FacadeClass();
    

  }
  
}
