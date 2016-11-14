package edu.oakland.production;

import java.awt.*;
import javax.swing.*;

public class ButtonBuilder {

	private JButton buttonEnterBalance;
	private JButton buttonEnterWithdrawAmount;

	public ButtonBuilder() {

		buttonEnterBalance = new JButton("Enter Account Balance");
		buttonEnterWithdrawAmount = new JButton("Enter Withdraw Amount");
	}

	public JButton getButtonEnterBalance() {
		return buttonEnterBalance;
	}

	public JButton getButtonEnterWithdrawAmount() {
		return buttonEnterWithdrawAmount;
	}
}
