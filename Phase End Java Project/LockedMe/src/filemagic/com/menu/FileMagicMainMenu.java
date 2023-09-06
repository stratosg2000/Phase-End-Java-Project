package filemagic.com.menu;

import java.util.Scanner;
import filemagic.com.service.FileMagicMainService;

public class FileMagicMainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mainMenuChoice; // user's choice in main menu
		String mainMenuCon; // check if user wants to continue or not
		char verifyExit; // check for verification while asking y/n the user

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println(" ------------------------------------------------------------- ");
			System.out.println(" Welcome to the new application deleloped by Lockers Pvt. Ltd");
			System.out.println(" Application's Name: FileMagic ");
			System.out.println(" Developer's name: Efstratios Gaitanidis ");
			System.out.println(" Contact details: efstratios.gaitanidis@vodafone.com");
			System.out.println(" ------------------------------------------------------------- ");
			System.out.println();

			do {
				System.out.println(" ########################################## ");
				System.out.println("FileMagic provides the below options:");
				System.out.println("1: Display the files of a folder in ascending order");
				System.out.println("2: Business level operation (For adding, deleting and searching a file");
				System.out.println("0: To exit from the app");
				System.out.println("Please enter your choice <0-2>");
				System.out.println(" ########################################## ");

				mainMenuChoice = scanner.nextLine();

				switch (mainMenuChoice) {

				case "1":
					FileMagicMainService list = new FileMagicMainService();
					list.magicListFiles(scanner);
					break;

				case "2":
					FileMagicBusinessMenu magicBusinessMenu = new FileMagicBusinessMenu();
					magicBusinessMenu.displayBusinessMenu(scanner);
					break;

				case "0":
					break;

				default:
					System.out.println("Invalid choice. Valid input values are <0-2>");
					break;
				}

				// this part of code validates a correct input from the user.

				do {
					verifyExit = 'n'; // initial value
					System.out.println("Do you want to continue? Valid inputs are <y or n>");
					mainMenuCon = scanner.nextLine();

					if (mainMenuCon.equalsIgnoreCase("y") | mainMenuCon.equalsIgnoreCase("n")) {
						verifyExit = 1;
					}

				} while (verifyExit == 'n');

			} while (mainMenuCon.equalsIgnoreCase("y"));

			scanner.close();
			
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}

		System.out.println("FileMagic has successfully exited");
		System.out.println("Thank you for using FileMagic");

	}
}
