package com.MobilePhoneContactsManagementApp;
/*
 * name:
 *    	 Viswas Vatte              
 * date:
 *     	October 22,2019
 * description:
 * this is a simple mobile phone contacts management system
 * it enables the user to
 * 1) Add new contact
 * 2) Modify contact
 * 3) Search Contact
 * 4) Remove Contact
 * 5) Print all Contact information.
 * It utilizes ArrayLists in Java to store and manage data
 * 
 **/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MobilePhone mobilephone = new MobilePhone();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		printMenu();
		while (!quit) {
			System.out.println("\n Please enter option: ");
			System.out.println("(Enter 6 to display the menu)");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 0:
				System.out.println("\n Quit the program...");
				quit = true;
				break;
			case 1:
				mobilephone.printContacts();
				break;
			case 2:
				mobilephone.addNewContact();
				break;
			case 3:
				mobilephone.updateContact();
				break;
			case 4:
				mobilephone.removeContact();
				break;
			case 5:
				mobilephone.searchContact();
				break;
			case 6:
				printMenu();
				break;
			}
		}
	}

	static void printMenu() {
		System.out.println("0 - Quit the program\r\n" + "1 - Print list of contacts\r\n" + "2 - Add new contact\r\n"
				+ "3 - Update existing contact\r\n" + "4 - Remove contact\r\n" + "5 - Search/find contact\r\n"
				+ "6 - Print the menu.");
	}

}
