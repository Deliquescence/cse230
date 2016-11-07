package edu.oakland.production;

import java.awt.*;
import javax.swing.*;

public class Launcher {

	public static void main(String[] args) {
		// atmgui gui = new atmgui();
		JFrame gui = new JFrame();

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		int width = screenSize.width;
		int height = screenSize.height;

		gui.setLocation(width / 4, height / 4);

		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("ATM User Interface");
		gui.setSize(500, 500);

		gui.setVisible(true);
	}
}
