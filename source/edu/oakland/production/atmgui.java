package edu.oakland.production;

import edu.oakland.helper.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class atmgui extends JFrame {
	private JButton entAcctBalance;
	private JButton entWithAmt;
	private JLabel acctBal;
	private JLabel withAmt;
	private JLabel reqAccpt;
	private JLabel reqDen;
	private JLabel amtIss;
	private JLabel displayAmtIss;
	private JLabel cardStatus;
	private JLabel cardRej;
	private JTextField inputBal;
	private JTextField inputWith;
	private BankDB bdb;
	private ATM atm;
	private Container pane;
	int balance;
	int withdrawal;

	//constructor
	public atmgui() {
		//call method to initialize GUI
		initGUI();

		bankDB = new bankDB(0);
		atm = new ATM(bankDB);
	}

	//initialize the gui
	private void initGUI() {
		pane = getContentPane();
		pane.setLayout(new FlowLayout());

		ButtonHandler handler = new ButtonHandler();

		ButtonBuilder bb = new ButtonBuilder();
		LabelBuilder lb = new LabelBuilder();
		TextFieldMaker tm = new TextFieldMaker();


		//Upper Left
		JPanel paneUpLeft = new JPanel();
		paneUpLeft.setLayout(new FlowLayout());

		//add buttons for upper left panel
		entAcctBalance = bb.getButtonEnterBalance();
		entAcctBalance.addActionListener(handler);
		paneUpLeft.add(entAcctBal);

		//add text fields for upper left panel
		inputBal = tm.getInputBal();
		paneUpLeft.add(inputBal);

		//add labels for the upper left panel
		acctBal = lb.getLabelAccountBalance();
		paneUpLeft.add(lblHandler.acctBal());
		paneUpLeft.setVisible(true);


		//Upper Right
		JPanel paneUpRight = new JPanel();
		paneUpRight.setLayout(new FlowLayout());

		//add text field for upper right panel
		inputWith = tm.getInputWith();
		paneUpRight.add(inputWith);

		//add button
		entWithAmt = bb.getButtonEnterWithdrawAmount();
		entWithAmt.addActionListener(handler);
		paneUpRight.add(entWithAmt);

		//add labels
		withAmt = lb.getLabelWithdrawAmount();
		paneUpRight.add(withAmt);
		paneUpRight.setVisible(true);

		//Bottom Left
		JPanel paneBotLeft = new JPanel();
		paneBotLeft.setLayout(new FlowLayout());

		//add labels for bottom left panel
		reqAccpt = lb.getLabelReqAccepted();
		reqAccpt.setVisible(false);
		reqDen = lb.getLabelReqDenied();
		reqDen.setVisible(false);
		paneBotLeft.setVisible(true);


		//Bottom Right
		JPanel paneBotRight = new JPanel();
		paneBotRight.setLayout(new FlowLayout());

		//add labels for bottom right panel
		amtIss = lb.getLabelAmountIssuedHeader();
		displayAmtIss = lb.getLabelAmountIssued();
		cardStatus = lb.getLabelCardStatusHeader();
		cardRej = lb.getLabelCardStatus();
		paneBotRight.setVisible(true);

		//add the 4 panels
		pane.add(paneUpLeft);
		pane.add(paneUpRight);
		pane.add(paneBotLeft);
		pane.add(paneBotRight);
	}

	private class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == entAcctBalance) {
				//ENTER ACCOUNT BALANCE
				int bal = Integer.parseInt(inputBal.getText());
				bankDB.setBalance(bal);

				System.out.println("Set balance to " + bal);
			} else if (event.getSource() == entWithAmt) {
				//ENTER WITHDRAW AMOUNT
				int amount = Integer.parseInt(inputWith.getText());
				if (atm.submitAmount(amount)) {
					reqAccpt.setVisible(true);
					reqDen.setVisible(false);
					displayAmntIss.setText(amount.toString());
					cardRej.setVisible(false);

					System.out.println("Successfully withdrew " + amount);
				} else {
					reqAccpt.setVisible(false);
					reqDen.setVisible(true);
					displayAmntIss.setText("0");
					cardRej.setVisible(true);

					System.out.println("Tried to withdraw " + amount + " and failed");
				}
			} else {
				//Event not sourced from one of our buttons
				System.out.println("Help!");
			}
		}
	}
}
