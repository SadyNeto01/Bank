package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		char choice = 'p';
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();

		while (choice!= 'y' && choice!= 'n') {
			System.out.print("Is there am initial deposit value(y/n)?");
			 choice = sc.next().charAt(0);
		}
		
		if(choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(accountNumber, name, initialDeposit);
		}else {
			bank = new Bank(accountNumber, name );
		}
		System.out.println();
		System.out.print("Account Data:\n" + bank);
		System.out.println();
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		bank.depositValue(amount);
		System.out.print("Updated account Data:\n" + bank);
		System.out.println();
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		 amount = sc.nextDouble();
		bank.withdrawValue(amount);
		System.out.print("Updated account Data:\n" + bank);
		
		
		sc.close();
	}

}
