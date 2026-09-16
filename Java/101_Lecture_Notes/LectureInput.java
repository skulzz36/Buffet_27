/*
    Lecture note example - Input!!
*/

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
	} System.out.println("🦀Welcome to Isaac's RICH seafood buffet!🦀");
    System.out.println("Here is a list of all the items on the menu:");
    
    System.out.println("1. 6 piece King Crab Legs - $" + item1price);
    double item1price = 179.99;

    System.out.println("2. 2 piece Lobster tails (made by Gordon Ramsay) - $" + item2price);
    double item2price = 169.99;

    System.out.println("3. honey walnut shrimp - $" + item3price);
    double item3price = 29.99;

    System.out.println("4. 4 piece Fried Shrimp on a Stick - $" + item4price);
    double item4price = 24.99;

    System.out.println("5. 10 piece Sushi - $" + item5price);
    double item5price = 35.99;

    System.out.println("6. 3 pound Squid - $" + item6price);
    double item6price = 89.99;

    System.out.println("7. 6 piece muscles - $" + item7price);
    double item7price = 19.99;



    Scanner sc = new Scanner(System.in);
    System.out.println("Who is ordering today?");
    String name = sc.nextLine();
    System.out.println("Hello, what would you like to order today?");
    int item1Amt = sc.nextInt();

    double item1Total = item1Amt * item1price;
    double item2Total = item2Amt * item2price;
    double item3Total = item3Amt * item3price;
    double item4Total = item4Amt * item4price;
    double item5Total = item5Amt * item5price;
    double item6Total = item6Amt * item6price;
    double item7Total = item7Amt * item7price;
}
