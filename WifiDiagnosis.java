/*
 * Class: CMSC203 CRN 31569
 * Instructor: Ahmed Tarek
 * Description: A program that helps diagnose internet connection.
 * Due: 02/07/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Keroub Emmanuel Singavarapu
*/

import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		
		String userInput;
		
		Scanner choice = new Scanner(System.in);
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		System.out.println("\nFirst Step: Reboot your computer.");
		System.out.println("Are you able to connect with the internet? (yes or no): ");

		userInput = choice.next();
		
		while(!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no")) {
			System.out.println("\nPlease enter yes or no only!");
			System.out.print("Are you able to connect with the internet? (yes or no): ");
			userInput = choice.next();
		}
		
		if (userInput.equalsIgnoreCase("yes")) {
			System.out.println("\nRebooting your computer seemed to work.");
			System.exit(0);
		}
		else 
			System.out.println("\nSecond step: Reboot your router.");
			System.out.println("Now are you able to connect with the internet? (yes or no): ");
		
		userInput = choice.next();
		
		while(!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no")) {
			System.out.println("\nPlease enter yes or no only!");
			System.out.print("Are you able to connect with the internet? (yes or no): ");
			userInput = choice.next();
		}
		
		if (userInput.equalsIgnoreCase("yes")) {
			System.out.println("\nRebooting your router seemed to have worked.");
			System.exit(0);
		}
		else
			System.out.println("\nThird Step: Make sure the cables to your router are plugged in firmly and your router is getting power.");
			System.out.println("Now are you able to connect with the internet? (yes or no): ");
			
		userInput = choice.next();
		
		
		while(!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no")) {
			System.out.println("\nPlease enter yes or no only!");
			System.out.print("Are you able to connect with the internet? (yes or no): ");
			userInput = choice.next();
		}
		
		if (userInput.equalsIgnoreCase("yes")) {
			System.out.println("\nChecking your cables seemed to have worked.");
			System.exit(0);
		}
		else
			System.out.println("\nFourth Step: Move your computer closer to your router.");
			System.out.println("Now are you able to connect with the internet? (yes or no): ");
			
		userInput = choice.next();	
		
		while(!userInput.equalsIgnoreCase("yes") && !userInput.equalsIgnoreCase("no")) {
			System.out.println("\nPlease enter yes or no only!");
			System.out.print("Are you able to connect with the internet? (yes or no): ");
			userInput = choice.next();
		}
		
		if (userInput.equalsIgnoreCase("yes")) {
			System.out.println("\nMoving your computer closer to your router seemed to have worked.");
			System.exit(0);
		}
		else
			System.out.println("\nFifth Step: contact your ISP.");
			System.out.println("Make sure your ISP is hooked up to your router.");
			System.exit(0);	
		}
	}
