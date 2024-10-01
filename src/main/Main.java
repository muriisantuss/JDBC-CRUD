package main;

import java.util.Scanner;


import CRUD.Menu;
import CRUD.Read;
import CRUD.Uptade;
import CRUD.Create;
import CRUD.Delete;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice;

		do {
			// show options menu
			Menu.show();
			choice = in.nextInt();
			System.out.println();
			switch (choice) {
				case 1:
					System.out.println("Creating a product...");
					Create.show();
					break;
				case 2:
					System.out.println("Listing products...");
					Read.show();
					break;
				case 3:
					System.out.println("Updating products...");
					Uptade.show();
					break;
				case 4:
					System.out.println("Deleting a product...");
					Delete.show();
					break;
				case 5:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice! Please enter a number between 1 and 5.");
					break;
			}
		} while (choice != 5);

		in.close();
	}
}
