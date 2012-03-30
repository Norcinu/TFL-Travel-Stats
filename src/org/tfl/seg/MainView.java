package org.tfl.seg;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;

public class MainView extends JFrame {
	private static final long serialVersionUID = -4672675650807020559L;
	private static final int BORDER = 12;
	private static final int GAP = 5;
	
	private JComboBox<String> databaseCombo;
	private JTree collectionTree;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu settingsMenu;
	private JMenuItem menuItem;
	private JPanel mainPanel;
	private JPanel databasePanel;
	private JPanel content;
	private JToolBar dbToolbar;
	private JLabel mainStatArea;
	
	public MainView(String title) {
		super();
		createUI(title);
	}
	
	private void createUI(String title) {
		this.setTitle(title);
		createMenu();
		createUiComponents();
	}

	private void createUiComponents() {
		mainPanel = new JPanel(new GridLayout(2, 1, GAP, GAP));
		databasePanel = new JPanel(new GridLayout(2, 1, GAP, GAP));

		dbToolbar = new JToolBar();
		collectionTree = new JTree();
		databasePanel.add(dbToolbar);
		databasePanel.add(collectionTree);
		databasePanel.setSize(120, 640);
		
		databaseCombo = new JComboBox<String>();
		mainStatArea = new JLabel();
		mainPanel.add(databaseCombo);
		mainPanel.add(mainStatArea);
		mainPanel.setSize(320, 640);
		
		content = new JPanel(new GridBagLayout());
		content.setBorder(BorderFactory.createEmptyBorder(BORDER, BORDER, BORDER, BORDER));
		
		GBHelper pos = new GBHelper();
		content.add(databasePanel, pos);
		content.add(new Gap(GAP), pos.nextCol());
		content.add(mainPanel, pos.nextCol().expandW());
		
		this.add(content);
		this.setSize(640, 480);
	}

	private void createMenu() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		//fileMenu.getAccessibleContext()
		menuBar.add(fileMenu);
		menuItem = new JMenuItem("Open File", KeyEvent.VK_O);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription(
		        "This doesn't really do anything");
		fileMenu.add(menuItem);
		this.setJMenuBar(menuBar);
	}
}
