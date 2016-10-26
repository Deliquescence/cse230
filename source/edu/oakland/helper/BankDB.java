package edu.oakland.helper;

public class BankDB {

	private int balance;

	public BankDB(int startingBalance) {

		balance = bal;
	}

	public boolean fundsAvailable(int amount) {

		return amount <= balance;
	}

	public boolean withdraw(int amount) {
		if (fundsAvailable(amount)) {

			balance -= amount;

			return true;
		} else {
			return false;
		}
	}
}
