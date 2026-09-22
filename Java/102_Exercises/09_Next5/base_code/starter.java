/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = sc.nextInt();
		System.out.println(num + ", " + (num+1) + ", " + (num+2) + ", " + (num+3) + ", " + (num+4) + ", " + (num+5) + ", " + (num+6) + ", " + (num+7) + ", " + (num+8) + ", " + (num+9)  + ", " + (num+10));
		System.out.println( (num*1) + ", " + (num*2) + ", " + (num*3) + ", " + (num*4) + ", " + (num*5) + ", " + (num*6) + ", " + (num*7) + ", " + (num*8) + ", " + (num*9)  + ", " + (num*10));

		
		System.out.println(((double)num) / 100.0);
		System.out.println(((double)num) / 10.0);



	}
}
