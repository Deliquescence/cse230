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

	//private SISManager sis = new SISManager();

	//End of variables

	public SISGUI () {

		initGUI();
	}

	public void clearAllFields() {
		tb.clearAllFields();
	}

	private void initGUI() {
		//Create builders
		LabelBuilder lb = new LabelBuilder();
		TextFieldBuilder tb = new TextFieldBuilder();
		JButtonBuild bb = new JButtonBuild();

		//Assign variables to widgets from builders
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

		JSeparator separatorTopButtons = new JSeparator(SwingConstants.HORIZONTAL);
		JSeparator separatorBottomButtons = new JSeparator(SwingConstants.HORIZONTAL);
		separatorTopButtons.setMaximumSize(new Dimension(999999,20));
		separatorBottomButtons.setMaximumSize(new Dimension(999999,20));

		//Create panels
		Container contentPane = getContentPane();
		JPanel panelTop = new JPanel();
		JPanel panelBottom = new JPanel();

		//Create layouts
		GroupLayout layoutTop = new GroupLayout(panelTop);
		GroupLayout layoutBottom = new GroupLayout(panelBottom);

		//Assign layouts
		panelTop.setLayout(layoutTop);
		panelBottom.setLayout(layoutBottom);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		//Configure layouts
		layoutTop.setAutoCreateGaps(true);
		layoutTop.setAutoCreateContainerGaps(true);
		layoutBottom.setAutoCreateGaps(true);
		layoutBottom.setAutoCreateContainerGaps(true);

		//Begin top horizonal and vertical groups
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
		//End top horizonal and vertical groups

		//Begin bottom horizonal and vertical groups
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
		//End bottom horizonal and vertical groups

		System.out.println("fdsa");
		contentPane.add(panelTop);
		contentPane.add(panelBottom);
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
