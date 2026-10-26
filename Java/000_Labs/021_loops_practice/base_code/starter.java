/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		int number = (int)(Math.random()* 1000) +1;
		int randomNum = 0;

		System.out.println("Welcome to the guessing game!");

		while(randomNum != number){

		  System.out.println("please guess a number:");
		  randomNum = sc.nextInt();
          
		  if (randomNum > number) {
            System.out.println("too high!");
		  }else if (randomNum < number){
			System.out.println("too low.");
		  } else {
			System.out.println("hooray you win!");
		  }

		}







		
	}
}
