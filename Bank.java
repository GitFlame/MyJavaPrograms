/*Question 1: Design a class for a bank and define methods that should support the following operations. 
* 1.  Deposit a certain amount into an account.
* 2.  Withdrawing a cetain amount from an account.
* 3.  Return a value specifying the amount(i.e. balance) in an amount.
*/

import java.util.Scanner;
//Creating  a class named Bank
public class Bank {
	String name;
	int accountNum;
	float currentAmt;
	float depositAmt;
	float widthdrawAmt;
	Scanner sc = new Scanner(System.in);
	
	//method which will deposit money in bank account
	public void depositAmount() {
		System.out.println("\n\n-----------------DEPOSIT AMOUNT-----------------\n\nCURRENT BALANCE: Rs " + currentAmt);
		System.out.print("Enter the amount which you want to deposit (in rupees): ");
		currentAmt = sc.nextFloat();
		depositAmt = currentAmt + depositAmt;
		System.out.println("UPDATED CURRENT BALANCE : Rs " + depositAmt);
	}
	
	//method which will withdraw money from bank account
	public void withdrawAmount() {
		System.out.println("-----------------WITHDRAW AMOUNT-----------------\n\nCURRENT BALANCE: Rs " + currentAmt);
		System.out.println("Enter the amount which you want to widthdraw :");
		widthdrawAmt = sc.nextFloat();
		if(widthdrawAmt < currentAmt) {
			System.out.println("WITHDRAWAl AMOUNT : Rs" + widthdrawAmt);
			widthdrawAmt = currentAmt - widthdrawAmt;
			System.out.println("Current Balance after widthdrawal amount : Rs"+ widthdrawAmt);
		}
		else {
			System.out.println("Sorry, You cannot widthdraw amount. You don't have much balance .\n Your current balance is :" + currentAmt+"\nPlease widthdraw less amount.");
		}
	}
	
	//method which will display the balance according to the users need
	public float viewBalance() {
		System.out.println("\n\n----------------------------BALANCE---------------------------\n");
		return currentAmt;
	}
	
	//method which will display the display the bank services
	public void selectOperation() {
		System.out.print("-------------------------------------LIST OF SERVICES------------------------------------\n\n1. DEPOSIT AMOUNT\t\t2. WITHDRAW AMOUNT\t\t3. VIEW ACCOUNT BALANCE\t\t4. LOG OUT\n\nTo choose the services write the corresponding serial number (1,2,3,4) below:");
		byte choice = sc.nextByte();
		switch(choice) {
			case 1: depositAmount();
			break;
			
			case 2: withdrawAmount();
			break;
			
			case 3: System.out.println("Current Balance : Rs" + viewBalance());
			break;
			
			case 4: System.out.println("Thank you, Visit Again!!");
			break;
			
			default: System.out.println("Invalid choice, please choose from above given options.");
		}
	}
	
	//method which will executes the above methods again
	public void executeAgain() {
		while(true) {
			System.out.println("Do you want to do any other operations (type y for yes and any other key for exit):");
			char option = sc.next().charAt(0);
		
			if(option == 'y') {
				selectOperation();
			}
			else {
				return;
			}
		}
	}
	
	//main method
	public static void main(String args[]) {
		Bank bank = new Bank();
		System.out.println("Enter your full name :" );
		bank.name = bank.sc.nextLine();
		System.out.println("Enter your account number :");
		bank.accountNum = bank.sc.nextInt();
		System.out.println("Welcome " + bank.name);
		bank.selectOperation();
		bank.executeAgain();
	}
}
	
		
		
		
