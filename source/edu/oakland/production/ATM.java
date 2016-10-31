package edu.oakland.production;

import edu.oakland.helper.*;

public class ATM {

	private BankDB bankDB;

	public ATM(BankDB DB) {
		bankDB = DB;
	}

	public boolean submitAmount(int amount) {
		if (bankDB.fundsAvailable(amount)) {
			return bankDB.withdraw(amount);
		} else {
			return false;
		}
	}
}
