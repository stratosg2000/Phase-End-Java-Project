package filemagic.com.menu;

import java.util.Scanner;
import filemagic.com.service.FileMagicBusinessService;


public class FileMagicBusinessMenu {

	public void displayBusinessMenu(Scanner scanner) {
		// TODO Auto-generated method stub
		String businessMenuChoice;

		System.out.println(" ########################################## ");
		System.out.println("FileMagic provides the below business options:");
		System.out.println("0: Create a file");
		System.out.println("1: Delete a file");
		System.out.println("2: Search a file");
		System.out.println("Please enter your choice <0-2>");
		System.out.println(" ########################################## ");

		businessMenuChoice = scanner.nextLine();

		switch (businessMenuChoice) {

		case "0":
			FileMagicBusinessService add = new FileMagicBusinessService();
			add.magicBusinness(scanner, "creating");
			break;

		case "1":
			FileMagicBusinessService delete = new FileMagicBusinessService();
			delete.magicBusinness(scanner, "deleting");
			break;

		case "2":
			FileMagicBusinessService search = new FileMagicBusinessService();
			search.magicBusinness(scanner, "searching");
			break;

		default:
			System.out.println("Invalid choice. Valid input values are <0-2>");
			break;
		}

	}
}