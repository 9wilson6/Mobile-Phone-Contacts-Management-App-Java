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
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	Contact contact;
	Scanner scan;
	private ArrayList<Contact> myContacts;

	public MobilePhone() {
		myContacts = new ArrayList<>();
	}

	// method to add new contact
	public void addNewContact() {
		scan = new Scanner(System.in);
		System.out.println("Enter new contact name:");
		String contactName = scan.nextLine().trim().trim();
		System.out.println("Enter phone number:");
		String contactPhoneNumber = scan.nextLine().trim();
		contact = new Contact(contactName, contactPhoneNumber);
		boolean checkIfContactExists = false;
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(contactName)
					&& myContacts.get(i).getPhoneNumber().equals(contactPhoneNumber)) {
				checkIfContactExists = true;
			}
		}
		if (checkIfContactExists) {
			System.out.println("Contact already exists");
		} else {
			myContacts.add(contact);
			System.out.println("New contact added: \n Name: " + contactName + ", Phone: " + contactPhoneNumber);
		}

	}

	// method to update contact
	public void updateContact() {
		System.out.println("Enter Contact Name");
		String contactName = scan.nextLine().trim();
		boolean contactExists = false;
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(contactName)) {
				System.out.println("Enter new Contact name");
				String newContactName = scan.nextLine().trim();
				System.out.println("Enter new contact phone number:");
				String newContactNumber = scan.nextLine().trim();
				contact = new Contact(newContactName, newContactNumber);
				myContacts.set(i, contact);
				System.out.println("Successfully updated record.");
				contactExists = true;
			}

		}
		if (!contactExists) {
			System.out.println("Contact is not found in the list.");
		}

	}

	// method to delete contact
	public void removeContact() {
		System.out.println("Enter existing contact name:");
		String contactName = scan.nextLine().trim();
		boolean contactExists = false;
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(contactName)) {
				myContacts.remove(i);
				System.out.println(contactName + " was deleted. \nSuccessfully deleted.");
				contactExists = true;
			}

		}
		if (!contactExists) {
			System.out.println("Contact is not found in the list.");
		}
	}

	// method to search contact
	public void searchContact() {
		System.out.println("Enter existing contact name:");
		String contactName = scan.nextLine().trim();
		boolean contactExists = false;
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(contactName)) {
				System.out.println("Name: " + myContacts.get(i).getName() + " Phone number: "
						+ myContacts.get(i).getPhoneNumber());
				contactExists = true;
			}

		}
		if (!contactExists) {
			System.out.println("Contact is not found in the list.");
		}
	}

	// print a list of all contacts
	public void printContacts() {
		System.out.println("Contact List");
		for (int i = 0; i < myContacts.size(); i++) {

			System.out.println((i+1)+"."+myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
		}

	}
}
