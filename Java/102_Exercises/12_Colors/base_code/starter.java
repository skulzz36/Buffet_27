/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
       
        int large = 255;
        int small = 0;
        int smallest = 80;

        int red = (int)(Math.random()*(large-small)+ smallest);
        int green = (int)(Math.random()*(large-small)+ smallest);
        int blue = (int)(Math.random()*(large-small)+ smallest);

        getColor(red, green, blue);


        int deadRed = 255 - red;
        int deadGreen = 255 - green;
        int deadBlue = 255 - blue;

        getColor(deadRed, deadGreen, deadBlue);


        getColor(red, green, blue);
        getColor(blue, red, green);
        getColor(green, blue, red);


        int myRed = (int)(Math.random() * 129);
        int myGreen = (int)(Math.random() * 129);
        int myBlue = (int)(Math.random() * 129);

        getColor(myRed, myGreen, myBlue);


        int lightRed = (int)(Math.random() * 128) + 128;
        int lightGreen = (int)(Math.random() * 128) + 128;
        int lightBlue = (int)(Math.random() * 128) + 128;

        getColor(lightRed, lightGreen, lightBlue);
        

        int STP = (int)(Math.random() * 128);
        int AIC = (int)(Math.random() * 128);
        int PJ = (int)(Math.random() * 128) + 128;

        getColor(STP, AIC, PJ);


        int kurt = (int)(Math.random() * 128) + 128;
        int dave = (int)(Math.random() * 101);
        int krist = (int)(Math.random() * 128) + 128;

        getColor(kurt, dave, krist);



		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);

    }
}
