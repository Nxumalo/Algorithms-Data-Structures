import java.util.*;

public class MakeChange {
	
	static Scanner console = new Scanner(System.in);
	
	static final int HALFDOLLAR = 50;
	static final int QUARTER = 25;
	static final int DIME =10;
	static final int NICKEL = 5;
	
	public static void main(String [] args) {
		 int change;
		 System.out.print("Enter the change in cents: ");
		 System.out.flush();
		 
		 change = console.nextInt();
		 System.out.println();
		 System.out.println("The change you entered is "+change);
		 
		 System.out.println("The number of half dollars "+"to be returned is "+change/HALFDOLLAR);
		 
		 change = change%HALFDOLLAR;
		 
		 System.out.println("The number of quarters to be "+"returned is "+ change/QUARTER);
		 
		 change = change%QUARTER;
		 
		 System.out.println("The number of dimes to be "+"return is "+change/DIME);
		 
		 change = change%DIME;
		 
		 System.out.println("The number of nickels to be "+"return is "+change/NICKEL);
		 
		 change = change%NICKEL;
		 System.out.println("The number of pennes to be returned is "+change);
	}
}
