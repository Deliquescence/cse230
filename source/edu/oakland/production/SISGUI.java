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

	private JLabel inLabel_Header;
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
	private JTextField outText_Major;
	private JTextField outText_Status;
	private JTextField outText_Progress;

	private JLabel outLabel_Header;
	private JLabel outLabel_GID;
	private JLabel outLabel_Name;
	private JLabel outLabel_Major;
	private JLabel outLabel_Status;
	private JLabel outLabel_Progress;

	private JButton outButton_Print;

	//Variables for widget builders
	private LabelBuilder lb;
	private TextFieldBuilder tb;
	private JButtonBuild bb;

	//Other variables
	private SISManager sis = new SISManager();

	/*
	 * End of variables
	 */

	public SISGUI () {

		initGUI();
	}

	private void initGUI() {
		//Create builders
		lb = new LabelBuilder();
		tb = new TextFieldBuilder();
		bb = new JButtonBuild();

		//Assign widget variables using builders
		inText_GID = tb.getTextField("enterId");
		inText_Name = tb.getTextField("enterName");
		inText_Major = tb.getTextField("enterMajor");
		inText_Status = tb.getTextField("enterStatus");
		inText_Progress = tb.getTextField("enterProgress");

		inLabel_Header = lb.getInputHeader();
		inLabel_GID = lb.getInputGrizzlyID();
		inLabel_Name = lb.getInputName();
		inLabel_Major = lb.getInputMajor();
		inLabel_Status = lb.getInputStatus();
		inLabel_Progress = lb.getInputProgress();

		inButton_Create = bb.getCreateStudentRecord();
		inButton_RetrieveByGID = bb.getRetrieveStudentRecordByGID();
		inButton_RetrieveByName = bb.getRetrieveStudentRecordByName();

		outText_GID = tb.getTextField("printId");
		outText_Name = tb.getTextField("printName");
		outText_Major = tb.getTextField("printMajor");
		outText_Status = tb.getTextField("printStatus");
		outText_Progress = tb.getTextField("printProgress");

		outLabel_Header = lb.getOutputHeader();
		outLabel_GID = lb.getOutputGrizzlyID();
		outLabel_Name = lb.getOutputName();
		outLabel_Major = lb.getOutputMajor();
		outLabel_Status = lb.getOutputStatus();
		outLabel_Progress = lb.getOutputProgress();

		outButton_Print = bb.getPrintRetrievedRecord();
		//End builder -> widget assignment

		//Create separators to make things look nice
		//Between input text fields and buttons
		JSeparator separatorTopButtons = new JSeparator(SwingConstants.HORIZONTAL);
		//Between output text fields and buttons
		JSeparator separatorBottomButtons = new JSeparator(SwingConstants.HORIZONTAL);
		separatorTopButtons.setMaximumSize(new Dimension(999999, 10));
		separatorBottomButtons.setMaximumSize(new Dimension(999999, 10));

		//Create panels
		Container contentPane = getContentPane();
		JPanel panelTop = new JPanel();
		JPanel panelBottom = new JPanel();

		//Create GroupLayouts
		GroupLayout layoutTop = new GroupLayout(panelTop);
		GroupLayout layoutBottom = new GroupLayout(panelBottom);

		//Assign layouts
		panelTop.setLayout(layoutTop);
		panelBottom.setLayout(layoutBottom);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		//Configure GroupLayouts
		layoutTop.setAutoCreateGaps(true);
		layoutTop.setAutoCreateContainerGaps(true);
		layoutBottom.setAutoCreateGaps(true);
		layoutBottom.setAutoCreateContainerGaps(true);


		/*
		 * Begin horizonal and vertical groups for top half
		 */
		layoutTop.setHorizontalGroup (
			layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(inLabel_Header)
				//Input boxes with labels
				.addGroup(layoutTop.createSequentialGroup()
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
				)
				//End input boxes with labels

				.addComponent(separatorTopButtons)
				//Buttons
				.addGroup(layoutTop.createSequentialGroup()
					.addComponent(inButton_Create)
					.addComponent(inButton_RetrieveByGID)
					.addComponent(inButton_RetrieveByName)
				)
		);

		layoutTop.setVerticalGroup (
			layoutTop.createSequentialGroup()
				.addComponent(inLabel_Header)
				//Begin input boxes with labels
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
				//End input boxes with labels
				.addComponent(separatorTopButtons)
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inButton_Create)
					.addComponent(inButton_RetrieveByGID)
					.addComponent(inButton_RetrieveByName)
				)
		);
		/*
		 * End horizonal and vertical groups for top half
		 *
		 * Begin horizonal and vertical groups for bottom half
		 */
		layoutBottom.setHorizontalGroup (
			layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(outLabel_Header)
				//Input boxes with labels
				.addGroup(layoutBottom.createSequentialGroup()
					.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(outText_GID)
						.addComponent(outText_Name)
						.addComponent(outText_Major)
						.addComponent(outText_Status)
						.addComponent(outText_Progress)
					)
					.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(outLabel_GID)
						.addComponent(outLabel_Name)
						.addComponent(outLabel_Major)
						.addComponent(outLabel_Status)
						.addComponent(outLabel_Progress)
					)
				)
				//End input boxes with labels

				.addComponent(separatorBottomButtons)
				//Buttons
				.addGroup(layoutBottom.createSequentialGroup()
					.addComponent(outButton_Print)
				)
		);

		layoutBottom.setVerticalGroup (
			layoutBottom.createSequentialGroup()
				.addComponent(outLabel_Header)
				//Begin input boxes with labels
				.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(outText_GID)
					.addComponent(outLabel_GID)
				)
				.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(outText_Name)
					.addComponent(outLabel_Name)
				)
				.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(outText_Major)
					.addComponent(outLabel_Major)
				)
				.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(outText_Status)
					.addComponent(outLabel_Status)
				)
				.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(outText_Progress)
					.addComponent(outLabel_Progress)
				)
				//End input boxes with labels
				.addComponent(separatorBottomButtons)
				.addGroup(layoutBottom.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(outButton_Print)
				)
		);
		/*
		 * End horizonal and vertical groups for bottom half
		 */

		//Add halves to the frame
		contentPane.add(panelTop);
		contentPane.add(panelBottom);

		System.out.println("GUI Initialized.");
	}

	/*
	 * Clear all text fields, setting text to nothing.
	 * Affects both input and output fields.
	 */
	public void clearAllFields() {
		tb.clearAllFields();
	}


	private class CreateRecord implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				String status = inText_Status.getText();
				// boolean st;
				// char firstChar = Character.toLowerCase(status.charAt(0));
				// if (firstChar == 't' || firstChar == 'y') {
				// 	st = true;
				// }
				// else if (firstChar == 'f' || firstChar == 'n') {
				// 	st = false;
				// } else {
				// 	//TODO: Decide how to handle input validation
				// 	throw new java.text.ParseException("Unable to parse status into boolean", 0);
				// }
				sis.createRecord (
					inLabel_GID.getText(),
					inLabel_Name.getText(),
					inLabel_Major.getText(),
					inLabel_Progress.getText(),
					status
				);
				sis.storeRecord();
				clearAllFields();
			}
			catch (Exception exception) {

			}
		}
	}

	private class RetrieveRecord implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			StudentRecord s;
			String idString = inLabel_GID.getText();
			String nameString = inLabel_Name.getText();
			if(idString != "") {
				s = sis.retrieveByID(idString); //Retrieve record
			}
			else if (nameString != "") {
				s = sis.retrieveByName(nameString); //Retrieve record
			}
			clearAllFields();
			outText_GID.setText(s.getGrizzlyID());
			outText_Name.setText(s.getName());
			outText_Status.setText(s.getStudentType()); //grad under
			outText_Progress.setText(s.getMajorStandingAchieved()); // True/False?
			outText_Major.setText(s.getMajor());
		}
	}

	private class ClearFields implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			clearAllFields();
		}
	}
}
