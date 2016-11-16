package edu.oakland.helper;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class TextFieldBuilder extends JTextField {

	private HashMap<String, JTextField> textFields = new HashMap<>();
	private final int LENGTH = 15; //All fields are of a fixed length right now.

	public TextFieldBuilder() {
		String[] strings =
			new String[] {"enterId", "enterName", "enterStatus", "enterProgress", "printId",
						  "printName", "printStatus", "printProgress", "enterMajor", "printMajor"};

		for (String s : strings) {
			textFields.put(s, new JTextField(LENGTH));
		}
	}

	//Use the strings from the above array.
	public JTextField getTextField(String s) {
		if (textFields.containsKey(s)) {
			return textFields.get(s);
		}

		return null;
	}
}
