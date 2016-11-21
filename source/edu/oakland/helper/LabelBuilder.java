package edu.oakland.helper;


import java.awt.*;
import javax.swing.*;


public class LabelBuilder {

	private JLabel inputHeader;
	private JLabel inputGrizzlyID;
	private JLabel inputName;
	private JLabel inputStatus;
	private JLabel inputProgress;
	private JLabel inputMajor;

	private JLabel outputHeader;
	private JLabel outputGrizzlyID;
	private JLabel outputName;
	private JLabel outputStatus;
	private JLabel outputProgress;
	private JLabel outputMajor;

	public LabelBuilder() {
		inputHeader = new JLabel("Data Input");
		inputGrizzlyID = new JLabel("Grizzly ID");
		inputName = new JLabel("Name");
		inputStatus = new JLabel("Status (UnderGrad/Grad)");
		inputProgress = new JLabel("Sat Progress for Degree");
		inputMajor = new JLabel("Major");

		outputHeader = new JLabel("Data Output");
		outputGrizzlyID = new JLabel("Grizzly ID");
		outputName = new JLabel("Name");
		outputStatus = new JLabel("Status (UnderGrad/Grad)");
		outputProgress = new JLabel("Sat Progress for Degree");
		outputMajor = new JLabel("Major");

		inputHeader.setFont(new Font(inputHeader.getFont().getName(), Font.BOLD, 16));
		inputHeader.setHorizontalAlignment(JLabel.CENTER);
		outputHeader.setFont(new Font(outputHeader.getFont().getName(), Font.BOLD, 16));
		outputHeader.setHorizontalAlignment(JLabel.CENTER);
	}

	public JLabel getInputHeader() {
		return inputHeader;
	}

	public JLabel getInputGrizzlyID() {
		return inputGrizzlyID;
	}

	public JLabel getInputName() {
		return inputName;
	}

	public JLabel getInputMajor() {
		return inputMajor;
	}

	public JLabel getInputStatus() {
		return inputStatus;
	}

	public JLabel getInputProgress() {
		return inputProgress;
	}


	public JLabel getOutputHeader() {
		return outputHeader;
	}

	public JLabel getOutputGrizzlyID() {
		return outputGrizzlyID;
	}

	public JLabel getOutputName() {
		return outputName;
	}

	public JLabel getOutputMajor() {
		return outputMajor;
	}

	public JLabel getOutputStatus() {
		return outputStatus;
	}

	public JLabel getOutputProgress() {
		return outputProgress;
	}
}
