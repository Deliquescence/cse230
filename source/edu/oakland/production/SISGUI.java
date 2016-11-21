package edu.oakland.production;

import edu.oakland.helper.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SISGUI extends JFrame {

	/*
	 * Variables for widgets in input half
	 */

	private JTextField inText_GID;
	private JTextField inText_Name;
	private JTextField inText_Major;
	private JTextField inText_Status;
	private JTextField inText_Progress;

	private JLabel inLabel_GID;
	private JLabel inLabel_Name;
	private JLabel inLabel_Major;
	private JLabel inLabel_Status;
	private JLabel inLabel_Progress;

	private JButton inButton_Create;
	private JButton inButton_RetrieveByGID;
	private JButton inButton_RetrieveByName;

	/*
	 * Variables for widgets in output half
	 */

	private JTextField outText_GID;
	private JTextField outText_Name;
	private JTextField outText_Status;
	private JTextField outText_Progress;

	private JLabel outLabel_GID;
	private JLabel outLabel_Name;
	private JLabel outLabel_Status;
	private JLabel outLabel_Progress;
	private JLabel outLabel_NotFound;

	private JButton outButton_Print;

	//private SISManager sis = new SISManager();

	//End of variables

	public SISGUI () {

		initGUI();
	}

	public void clearAllFields() {
		tb.clearAllFields();
	}

	private void initGUI() {
		Container contentPane = getContentPane();

		//Create builders
		LabelBuilder lb = new LabelBuilder();
		TextFieldBuilder tb = new TextFieldBuilder();

		//Assign variables to widgets from builders
		inText_GID = tb.getTextField("enterId");
		inText_Name = tb.getTextField("enterName");
		inText_Major = tb.getTextField("enterMajor");
		inText_Status = tb.getTextField("enterStatus");
		inText_Progress = tb.getTextField("enterProgress");

		inLabel_GID = lb.getInputGrizzlyID();
		inLabel_Name = lb.getInputName();
		inLabel_Major = lb.getInputMajor();
		inLabel_Status = lb.getInputStatus();
		inLabel_Progress = lb.getInputProgress();


		//Create panels
		JPanel panelTop = new JPanel();
		JPanel panelBottom = new JPanel();

		//Create layouts
		GroupLayout layoutTop = new GroupLayout(panelTop);
		GroupLayout layoutBottom = new GroupLayout(panelBottom);

		//Assign layouts
		panelTop.setLayout(layoutTop);
		panelBottom.setLayout(layoutBottom);

		//Configure layouts
		layoutTop.setAutoCreateGaps(true);
		layoutTop.setAutoCreateContainerGaps(true);
		layoutBottom.setAutoCreateGaps(true);
		layoutBottom.setAutoCreateContainerGaps(true);

		layoutTop.setHorizontalGroup (
			layoutTop.createSequentialGroup()
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inText_GID)
					.addComponent(inText_Name)
					.addComponent(inText_Major)
					.addComponent(inText_Status)
					.addComponent(inText_Progress)
				)
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inLabel_GID)
					.addComponent(inLabel_Name)
					.addComponent(inLabel_Major)
					.addComponent(inLabel_Status)
					.addComponent(inLabel_Progress)
				)
		);

		layoutTop.setVerticalGroup (
			layoutTop.createSequentialGroup()
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inText_GID)
					.addComponent(inLabel_GID)
				)
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inText_Name)
					.addComponent(inLabel_Name)
				)
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inText_Major)
					.addComponent(inLabel_Major)
				)
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inText_Status)
					.addComponent(inLabel_Status)
				)
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inText_Progress)
					.addComponent(inLabel_Progress)
				)

		);

		System.out.println("fdsa");
		contentPane.add(panelTop);
	}

	private class CreateRecord implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				String status = inLabel_Status.getText();
				boolean st;
				if(status.charAt(0) == "t" || status.charAt(0) == "T") {
					st = true;
				}
				else if(status.charAt(0) == "f" || status.charAt(0) == "F") {
					st = false;
				}
				sis.createRecord(inLabel_GID.getText().parseInt(),
				inLabel_Name.getText(), inLabel_Major.getText(),
				inLabel_Progress.getText(), st);
				clearAllFields();
			}
			catch(Exception exception) {

			}
		}
	}

	private class RetrieveRecord implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			//Retrieve student record (button)
		}
	}

	private class ClearFields implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			clearAllFields();
		}
	}
}
