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

		





	

	}
}
