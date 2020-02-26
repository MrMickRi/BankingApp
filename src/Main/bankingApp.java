/**
 * 
 */
package Main;

import java.util.Scanner;

/**
 * @author Mick
 *
 */
public class bankingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//basic menu - to be moved to a separate method later on.
		System.out.println("*Welcome to the bank of Apps*");
		System.out.println("Please Select an item from the menu below.");
		System.out.println("1. View Balance");
		System.out.println("2. View Previous transaction");
		System.out.println("3. Withdraw Cash");
		System.out.println("4. Deposit Cash");
		System.out.println("5. Quit");
		
		Scanner menuInput = new Scanner(System.in);
		int i = menuInput.nextInt();
		
		switch( i ) {
		case 1: 
			System.out.println("1");
			break;
		case 2: 
			System.out.println("2");
			break;
		case 3: 
			System.out.println("2");
			break;
		case 4: 
			System.out.println("2");
			break;
		case 5: 
			System.out.println("Thank you for using BankingApp.");
			System.exit(0);
			break;
		default: 
			System.out.println("Default");
			break;
		}
	}

}
