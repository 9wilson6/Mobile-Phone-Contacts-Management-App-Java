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
public class Contact {
	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

}
