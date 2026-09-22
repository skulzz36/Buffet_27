/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		

		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
