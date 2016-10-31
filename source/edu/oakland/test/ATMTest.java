package edu.oakland.test;

import edu.oakland.helper.*;
import edu.oakland.production.*;

import junit.framework.*;

public class ATMTest extends TestCase {

	private final int STARTING_BALANCE = 500;
	private final int WITHDRAW_AMOUNT = 500;

	private BankDB bankDB;
	private ATM atm;

	public void setUp() {
		bankDB = new BankDB(STARTING_BALANCE);
		atm = new ATM(bankDB);
	}

	public void testATM() {
		System.out.println("Attempting to withdraw " + WITHDRAW_AMOUNT);
		boolean result = atm.submitAmount(WITHDRAW_AMOUNT);
		assertTrue(result);
	}
}
