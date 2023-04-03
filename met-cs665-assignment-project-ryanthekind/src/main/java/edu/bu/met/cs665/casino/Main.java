package edu.bu.met.cs665.casino;

/**
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    
    // Demonstration of bridge pattern
    
    System.out.println("---BRIDGE PATTERN---");
    CardGame blackjack = new Blackjack(new CardTable());
    blackjack.gameType();
    
    System.out.println("-------");
    CardGame poker = new Poker(new CardTable());
    poker.gameType();
    
    //Demonstration of the State Pattern
    System.out.println();
    System.out.println("---STATE PATTERN---");
    
    Person player = new Person();
    Person player1 = new Person();

    System.out.println("player:");
    player.placeChips();
    System.out.println("-------");
    
    player.play();
    System.out.println("-------");

    player.play();
    System.out.println("-------");
    
    player.fold();
    System.out.println("-------");
    player.fold();
    System.out.println("-------");
    
    player.leaveTable();
    System.out.println("-------");
    

    System.out.println("plaeyer1:");
    player1.placeChips();
    System.out.println("-------");
    player1.play();
    System.out.println("-------");
    player1.play();
    System.out.println("-------");
    player1.fold();
    System.out.println("-------");
    player1.leaveTable();
    
    System.out.println();
    System.out.println("---FACADE PATTERN---");
    System.out.println();
    
    FacadeClass playGame = new FacadeClass();
    
    Scanner scanner = new Scanner(System.in); // Creates a Scanner Object
    
    System.out.println("How much money do you have?");
    
    
    double playerWallet = scanner.nextDouble();

    playGame.playerWallet(playerWallet);
    
    
    System.out.println("How much do you want to BET?");
    //String userInput2 = scanner.nextLine();
    //double playerBet = Double.parseDouble(userInput2);
    
    double playerBet = scanner.nextDouble();
    
    playGame.placeBet(playerBet);
    
    playGame.startPlaying(playerWallet, playerBet);

    scanner.close();  
  } // end of main

} // end of class
