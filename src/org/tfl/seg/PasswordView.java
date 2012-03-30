package org.tfl.seg;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordView extends JFrame {
	public PasswordView(String message) {
		super();
		createUI(message);
	}
	
	private static final long serialVersionUID = -4824417552057557581L;
	private static final int ROWS = 4;
	private static final int COLUMNS = 2;
	
	private JPanel panel;
	private GridLayout grid;// = new GridLayout(ROWS, COLUMNS);
	private JLabel databaseLabel;
	private JLabel nameLabel;
	private JLabel passwordLabel;
	private JTextField databaseTextField;
	private JTextField nameTextField;
	private JPasswordField passwordTextField;
	private JButton okButton;
	private JButton cancelButton;
	
	private void createUI(String msg) {
		this.setTitle(msg);
		
		panel = new JPanel();
		grid = new GridLayout(ROWS, COLUMNS);
		panel.setLayout(grid);
	
		databaseLabel = new JLabel("Database URL:");
		nameLabel = new JLabel("Username:");
		passwordLabel = new JLabel("Password:");
		databaseTextField = new JTextField();
		nameTextField = new JTextField();
		passwordTextField = new JPasswordField();
		okButton = new JButton("Enter.");
		cancelButton = new JButton("Cancel.");
		
		panel.add(databaseLabel);
		panel.add(databaseTextField);
		panel.add(nameLabel);
		panel.add(nameTextField);
		panel.add(passwordLabel);
		panel.add(passwordTextField);
		panel.add(okButton);
		panel.add(cancelButton);
		
		this.setContentPane(panel);
		this.setSize(280, 140);	
	}
}
