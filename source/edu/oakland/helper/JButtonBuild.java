package edu.oakland.helper;

import java.awt.*;
import javax.swing.*;

public class JButtonBuild {

	private JButton createStudentRecord;
	private JButton retrieveStudentRecordByName;
	private JButton retrieveStudentRecordByGID;
	private JButton clearAllDataFields;
	private JButton printRetrievedRecord;

	//constructor
	public JButtonBuild() {
		//create JButtons
		createStudentRecord = new JButton("Create Student Record");
		retrieveStudentRecordByName = new JButton("Retrieve Student Record by Name");
		retrieveStudentRecordByGID = new JButton("Retrieve Student Record by GID");
		clearAllDataFields = new JButton("Clear All Data Fields");
		printRetrievedRecord = new JButton("Print Retrieved Record");
	}

	//methods to return JButtons
	public JButton getCreateStudentRecord() {
		return createStudentRecord;
	}

	public JButton getRetrieveStudentRecordByName() {
		return retrieveStudentRecordByName;
	}

	public JButton getRetrieveStudentRecordByGID() {
		return retrieveStudentRecordByGID;
	}

	public JButton getClearAllDataFields() {
		return clearAllDataFields;
	}

	public JButton getPrintRetrievedRecord() {
		return printRetrievedRecord;
	}
}
