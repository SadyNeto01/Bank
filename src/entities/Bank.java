package entities;

public class Bank {
	private int accountNumber;
	private String name;
	private double balance;
	
	public Bank() {
		
	}
	public Bank(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		depositValue(initialDeposit);
	}
	public Bank(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;

	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double initialDeposit(double balance) {
		return balance;
	}
	public void depositValue(double amount) {
		balance += amount;
	}
	
	public void withdrawValue(double amount) {
		balance  = - amount-5 + balance;
	}
	public String toString() {
		return "Account " + accountNumber + ", Holder: "
				+ name + ", Balance: " + 
				String.format("$ %.2f", balance);
	}
}
