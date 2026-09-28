/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

        int Large = 255;
        int Small = 0;
        int Smallest = 80;
       
        System.out.print("Large" + " ," + "Small" + " ," + "Smallest");

        int num1 = 255;
        int num2 = 0;
        int Red = (int)(Math.random() *(Large-Small)+ Smallest);
        int Green = (int)(Math.random() *(Large-Small)+ Smallest);
        int Blue = (int)(Math.random() *(Large-Small)+ Smallest);
     


		getColor(Red, Green, Blue);



       
         int large = 255;
         int small = 0;
         int smallest = 80;

        int red = (int)(Math.random()*(large-small)+ smallest);
        int green = (int)(Math.random()*(large-small)+ smallest);
        int blue = (int)(Math.random()*(large-small)+ smallest);

        getColor(red, green, blue);



       

        
     



		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);

    }
}
