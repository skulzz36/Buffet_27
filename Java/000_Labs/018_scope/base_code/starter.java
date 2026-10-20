/*
 *	Author:
 *  Date:
*/

import java.util.*;

public class starter {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            String message = "Number is greater than 5!";
             System.out.println(message);
        }


        if (number < 20) {
            int bonus = 5;
            number = number + bonus;
            System.out.println("Bonus was: " + bonus);
        }

        
        
         int x = 0;

        if (x == 0) {
            System.out.println("x is zero!");
        }

         number = 100;
        System.out.println("Final number: " + number);
    }
}
