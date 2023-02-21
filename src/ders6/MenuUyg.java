package ders6;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MenuUyg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUyg frame = new MenuUyg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 455);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnFile.add(mnNew);
		
		JMenuItem mnıtmJavaProject = new JMenuItem("Java Project");
		mnNew.add(mnıtmJavaProject);
		
		JMenuItem mnıtmProject = new JMenuItem("Project");
		mnNew.add(mnıtmProject);
		
		JMenuItem mnıtmPackage = new JMenuItem("Package");
		mnNew.add(mnıtmPackage);
		
		JMenuItem mnıtmNewMenuItem = new JMenuItem("Open File");
		mnFile.add(mnıtmNewMenuItem);
		
		JMenuItem mnıtmRecentFiles = new JMenuItem("Recent Files");
		mnFile.add(mnıtmRecentFiles);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mnıtmExit = new JMenuItem("Exit");
		
		ImageIcon icon=new ImageIcon(getClass().getResource("/exit.png"));
		mnıtmExit.setIcon(icon);
		
		mnFile.add(mnıtmExit);
		
		JMenu mnUndoTyping = new JMenu("Edit");
		menuBar.add(mnUndoTyping);
		
		JMenuItem mnıtmNewMenuItem_2 = new JMenuItem("Undo Typing");
		mnUndoTyping.add(mnıtmNewMenuItem_2);
		
		JCheckBoxMenuItem chckbxmnıtmGoster = new JCheckBoxMenuItem("Butonu Goster");
		mnUndoTyping.add(chckbxmnıtmGoster);
		
		JMenu mnPanel = new JMenu("Panel");
		menuBar.add(mnPanel);
		
		JMenuItem mnıtmPanel1 = new JMenuItem("Panel1");
		mnPanel.add(mnıtmPanel1);
		
		JMenuItem mnıtmPanel2 = new JMenuItem("Panel2");
		mnPanel.add(mnıtmPanel2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTikla = new JButton("Tikla");
		btnTikla.setBounds(248, 151, 89, 41);
		btnTikla.setVisible(false);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.RED);
		panel1.setBounds(0, 0, 729, 372);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panel 1");
		lblNewLabel.setBounds(278, 132, 139, 95);
		panel1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(328, 5, 89, 23);
		panel1.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(422, 5, 30, 22);
		panel1.add(comboBox);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.GREEN);
		panel2.setBounds(0, 0, 729, 372);
		contentPane.add(panel2);
		
		JLabel lblPanel = new JLabel("Panel 2");
		lblPanel.setBounds(241, 133, 248, 124);
		panel2.add(lblPanel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(328, 5, 89, 23);
		panel2.add(btnNewButton_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(422, 5, 30, 22);
		panel2.add(comboBox_1);
		contentPane.add(btnTikla);
		mnıtmPanel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
		});
		
		mnıtmPanel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
			}
		});
		chckbxmnıtmGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxmnıtmGoster.isSelected()) {
					btnTikla.setVisible(true);
				} else {
					btnTikla.setVisible(false);
				}
			}
		});
		mnıtmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
