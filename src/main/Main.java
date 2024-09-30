package main;

import java.util.Scanner;
import CRUD.Menu;
import CRUD.Create;
import CRUD.Delete;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Choose an operation");
			// show options menu
			Menu.show();
			choice = in.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Creating a product...");
					Create.show();
					break;
				case 2:
					break;
				case 3:
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
