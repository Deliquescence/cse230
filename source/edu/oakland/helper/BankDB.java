package edu.oakland.helper;

public class BankDB {

	private int balance;

	public BankDB(int startingBalance) {

		balance = startingBalance;
	}

	public boolean checkFundsAvailable(int amount) {

		return amount <= balance;
	}

	public boolean issueFunds(int amount) {
		if (checkFundsAvailable(amount)) {

			balance -= amount;

			return true;
		} else {
			return false;
		}
	}
}
