/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Hello Dear traveler, choose a role.");
		System.out.println("1. Wizard");
		System.out.println("2. Warior");
		System.out.println("3. Rogue");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		if (name.equals("Wizard") || name.equals("wizard")) {
        System.out.println("you are now a wizard!");

		}else if (name.equals("Warior")){
         System.out.println("You are now a Warior!");
		 
	    
		}else if (name.equals("Rogue")){
         System.out.println("You are now a Rogue!");
		 
		}else {
          System.out.println("uknown role. Please try again");
		}

         
	     int strength = 0;

         int dexterity = 0;

         int intelligence = 0;

         int charisma = 0;



		 System.out.println("You have " + 20 + " points total"); 
           int points = 20;
		 System.out.println("Choose a trait: strength, dexterity, intelligence, or charisma");
         String trait = sc.next();

         if (trait.equals("strength")) {
         points = points - 10;

        } else if (trait.equals("dexterity")) {
         points = points - 10;

        } else if (trait.equals("intelligence")) {
         points = points - 10;

        } else if (trait.equals("charisma")) {
         points = points - 10;

        } else {
         System.out.println("Unknown trait.");
        }

         System.out.println("You have " + points + " points left.");


		 System.out.println("Choose a second trait: strength dexterity, intelligence, or charisma");
         trait = sc.next();

         if (trait.equals("strength")) {
         points = points - 10;
		 
        } else if (trait.equals("dexterity")) {
         points = points - 10;

        } else if (trait.equals("intelligence")) {
         points = points - 10;

        } else if (trait.equals("charisma")) {
         points = points - 10;

        } else {
         System.out.println("Unknown trait.");
        }

         System.out.println("You have " + 0 + " points left.");


         if (strength == 10){
         System.out.println("Strength: " + strength);

        }if (dexterity == 10){
         System.out.println("Dexterity: " + dexterity);

        }if (intelligence == 10){
         System.out.println("Intelligence: " + intelligence);

        }if (charisma == 10){
         System.out.println("Charisma: " + charisma);
        }



         System.out.println("Your stats:");

         System.out.println("Strength: " + strength);

         System.out.println("Dexterity: " + dexterity);

         System.out.println("Intelligence: " + intelligence);

         System.out.println("Charisma: " + charisma);




    

		 
		 


		
		 
	}
}
