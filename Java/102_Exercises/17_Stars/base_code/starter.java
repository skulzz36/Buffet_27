/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		 Scanner sc = new Scanner(System.in);
		 System.out.println("please enter a width.");
	     int width = sc.nextInt();
		 System.out.println("please enter a hight.");
		 int hight = sc.nextInt();

         int me = 0;
		 while(me < width){
			System.out.print("*");
			me++;
				
			}
		 
		 int count2 = 0;
		 while(true){
			if(count2 == hight){
				break;
		    }
			 int count3 = 0;

			 while(true){
				if(count3 == width){
					break;
				}
				System.out.print("*");
				count3++;

		    }
			System.out.println();
			count2++;
		 }
		 
		     System.out.println("please enter an integer.");
			int a = sc.nextInt();
			int b1 = 1;

			while (b1 <= a){
				int b2 = 0;

				while(b2 < b1){
					System.out.print("*");
					b2++;
				 }
				 System.out.println();
				 b1++;
			    }
           

				 System.out.println("Please enter a new integer.");
				 int c = sc.nextInt();

				 int c1 = 1;

				 while(c1 <= c){
					int c2 = c;

					while(c2 > c1){
						System.out.print(" ");
						c2--;
					}

				 int c3 = 0;
				 while (c3 < c1){
					System.out.print("*");
					c3++;
				 }
				 System.out.println();
				c1++;
				}
				



			

			
	}
}
