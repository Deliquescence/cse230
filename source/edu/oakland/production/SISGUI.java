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
	private JTextField outText_Status;
	private JTextField outText_Progress;

	private JLabel outLabel_Header;
	private JLabel outLabel_GID;
	private JLabel outLabel_Name;
	private JLabel outLabel_Status;
	private JLabel outLabel_Progress;
	private JLabel outLabel_NotFound;

	private JButton outButton_Print;

	//End of variables

	public SISGUI () {

		initGUI();
	}

	private void initGUI() {
		Container contentPane = getContentPane();

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


		JSeparator separatorButtons = new JSeparator(SwingConstants.HORIZONTAL);
		separatorButtons.setMaximumSize(new Dimension(999999,20));

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

				.addComponent(separatorButtons)
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
				.addComponent(separatorButtons)
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(inButton_Create)
					.addComponent(inButton_RetrieveByGID)
					.addComponent(inButton_RetrieveByName)
				)
		);

		System.out.println("fdsa");
		contentPane.add(panelTop);
	}
}
