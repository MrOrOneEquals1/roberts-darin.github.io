package javaCollections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class collection {
   public static void main(String[] args) {
	   
	  System.out.println("-------------------ArrayList----------------------");
      ArrayList semis = new ArrayList();
      semis.add("Cleveland Cavaliers");
      semis.add("Toronto Raptors");
      semis.add("Boston Celtics");
      semis.add("Philadelphia 76ers");
      semis.add("Houston Rockets");
      semis.add("Utah Jazz");
      semis.add("New Orleans Pelicans");
      semis.add("Golden State Warriors");

 
      // Original output
      System.out.println("Original Array - NBA Semi-finals");

      System.out.println(semis);
 
      // Jazz got lucky, Should OKC have won?
      System.out.println("\nDid the Jazz get Lucky?  Maybe OKC should have won.");
      List<String> OKC = new ArrayList<String>(semis);
      OKC.set(5, "Oklahoma City Thunder");
      System.out.println(OKC);
      
      //Remove Losers in the Semis
      System.out.println("\nThese are the winners of the Conference Semis (Utah lost, so it doesn't matter if they beat OKC)");
      List<String> confin = new ArrayList<String>(OKC);
      confin.remove(1); //Toronto is the second team (0=Cleveland, 1=Toronto)
      confin.remove(2); // After Toronto is gone, Philadelphia becomes the third position
      confin.remove(3); //After the previous 2 teams have been removed, OKC is now fourth
      confin.remove(3); //After the previous 3 are removed, New Orleans is now fourth
      System.out.println(confin);
      
      
   	


   
	  System.out.println("/n-------------------LinkedList----------------------");
	  System.out.println("Great NBA Players");
	  //LinkedList Example
	  LinkedList<String> players = new LinkedList<String>();
	  players.add("James Harden");
	  players.add("Steph Curry");
  	  players.add("LeBron James");
	  players.add("Kevin Durrant");
	  players.add("Russell Westbrook");
	
	  //Display LinkedList items
	  System.out.println("\nOrignial LinkedList:");
	  for(String counter: players) {
      System.out.println(counter);
				}

	  //Add First and Last
	  players.addFirst("Kawhi Leanord");
	  players.addLast("Giannis Antetokounmpo");
	
	  //Display LinkedList items
	        System.out.println("\nFirst/Last Item LinkedList:");
	  for(String counter: players) {
	        System.out.println(counter);
	   }
	
	  //Get and Set values in the list
	  String firstItem = players.get(0);
	        System.out.println("\nFirst element is: " + firstItem);
	  players.set(0, "Anthony Davis");
	  firstItem = players.get(0);
	        System.out.println("First element is: " + firstItem);
	        System.out.println();
	  for(String counter: players)      
	        System.out.println(counter);
	
	  //Remove first and last items in a list
	  players.removeFirst();
	  players.removeLast();
	        System.out.println("\nRemove First/Last LinkedList:");
	  for(String counter: players) {
	        System.out.println(counter);
	  }
	
	  //Add/remove from a position in the list
	  players.add(0, "Additional Item");
	  players.remove(2);
	        System.out.println("\nFinal LinkedList:");
	  for(String counter: players) {
	        System.out.println(counter);
	  }
	  }
	  }

