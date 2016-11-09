package edu.oakland.production;

import java.awt.*;
import javax.swing.*;

public class LabelBuilder {

	private JLabel labelAccountBalance;
	private JLabel labelWithdrawAmount;
	private JLabel labelReqAccepted;
	private JLabel labelReqDenied;
	private JLabel labelAmountIssuedHeader;
	private JLabel labelAmountIssued;
	private JLabel labelCardStatusHeader;
	private JLabel labelCardStatus;

	public LabelBuilder() {
		labelAccountBalance = new JLabel("Account Balance");
		labelWithdrawAmount = new JLabel("Withdraw Amount");
		labelReqAccepted = new JLabel("Request Accepted");
		labelReqDenied = new JLabel("Request Denied");
		labelAmountIssuedHeader = new JLabel("Amount Issued");
		labelAmountIssued = new JLabel("");
		labelCardStatusHeader = new JLabel("Card Status");
		labelCardStatus = new JLabel("");

		labelReqAccepted.setBackground(Colors.GREEN);
		labelReqDenied.setBackground(Colors.RED);
	}

	public JLabel getLabelAccountBalance() {
		return labelAccountBalance;
	}

	public JLabel getLabelWithdrawAmount() {
		return labelWithdrawAmount;
	}

	public JLabel getLabelReqAccepted() {
		return labelReqAccepted;
	}

	public JLabel getLabelReqDenied() {
		return labelReqDenied;
	}

	public JLabel getLabelAmountIssuedHeader() {
		return labelAmountIssuedHeader;
	}

	public JLabel getLabelAmountIssued() {
		return labelAmountIssued;
	}

	public JLabel getLabelCardStatusHeader() {
		return labelCardStatusHeader;
	}

	public JLabel getLabelCardStatus() {
		return labelCardStatus;
	}
}
