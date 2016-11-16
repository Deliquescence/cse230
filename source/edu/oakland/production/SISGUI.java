package edu.oakland.production;

// import edu.oakland.helper.*;
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

	//End of variables

	public SISGUI () {

		initGUI();
	}

	private void initGUI() {
		Container contentPane = getContentPane();

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


		inText_GID = new JTextField();
		inText_Name = new JTextField();
		inText_Status = new JTextField();
		inText_Progress = new JTextField();

		inLabel_GID = new JLabel("gid");
		inLabel_Name = new JLabel("name");
		inLabel_Status = new JLabel("status");
		inLabel_Progress = new JLabel("progress");


		layoutTop.setHorizontalGroup (
			layoutTop.createSequentialGroup()
				//Text Field column
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(inText_GID)
					.addComponent(inText_Name)
					.addComponent(inText_Status)
					.addComponent(inText_Progress)
				)
				//Label column
				.addGroup(layoutTop.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(inLabel_GID)
					.addComponent(inLabel_Name)
					.addComponent(inLabel_Status)
					.addComponent(inLabel_Progress)
				)
		);

		System.out.println("fdsa");
		contentPane.add(panelTop);
	}
}
