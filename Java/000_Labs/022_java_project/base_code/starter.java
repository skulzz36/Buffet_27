/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter{
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program. 
     
	           Scanner sc = new Scanner(System.in);
        int money = 100;
        int wager = 0;
        System.out.println("Welcome to the slot machine.");
        System.out.println("You have $" + money);
        while(money > 0) {
            System.out.println("Wager:");
            int w = sc.nextInt();
            if(w > money) {
                System.out.println("invalid");
            }
            else if(w <= 0) {
                System.out.println("invalid");
            }
            else {
                money = money - w;
                int a = (int)(Math.random() * 9) + 1;
                int b = (int)(Math.random() * 9) + 1;
                int c = (int)(Math.random() * 9) + 1;
                System.out.println("Slot numbers: " + a + " " + b + " " + c);
                if(a == b) {
                    if(b == c) {
                        money = money + w * 3;
                        System.out.println("Jackpot!");
                    }
                    else {
                        System.out.println("You lost!");
                    }
                }
                else {
                    System.out.println("You lost!");
                }
                System.out.println("Money: $" + money);
}   }               
}   }    