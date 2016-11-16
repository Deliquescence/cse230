package edu.oakland.helper;

import java.awt.*;
import javax.swing.*;

public class JButtonBuild extends JButton {

	JButton createStudentRecord;
	JButton storeStudentRecord;
	JButton retrieveStudentRecord;
	JButton clearAllDataFields;
	JButton printRetrievedRecord;

	//constructor
	public JButtonBuild() {
		//create JButtons
		createStudentRecord = new JButton("Create Student Record");
		storeStudentRecord = new JButton("Store Student Record");
		retrieveStudentRecord = new JButton("Retrieve Student Record");
		clearAllDataFields = new JButton("Clear All Data Fields");
		printRetrievedRecord = new JButton("Print Retrieved Record");
	}

	//methods to return JButtons
	public JButton getCreateStudentRecord() {
		return createStudentRecord;
	}

	public JButton getStoreStudentRecord() {
		return storeStudentRecord;
	}

	public JButton getRetrieveStudentRecord() {
		return retrieveStudentRecord;
	}

	public JButton getClearAllDataFields() {
		return clearAllDataFields;
	}

	public JButton getPrintRetrievedRecord() {
		return printRetrievedRecord;
	}
}
