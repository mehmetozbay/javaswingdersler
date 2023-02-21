package ders4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Combobox1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combobox1 frame = new Combobox1();
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
	public Combobox1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		String adlar[]= {"Ahmet", "Ali", "Can", "Sena", "Asya", "Nergis", "Huzeyfe"};
		JComboBox comboBox = new JComboBox(adlar);
		comboBox.setForeground(new Color(0, 0, 128));
		comboBox.setBackground(new Color(192, 192, 192));
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ahmet", "Ali", "Can", "Sena", "Asya", "Nergis", "Huzeyfe"}));
		comboBox.setBounds(241, 107, 292, 22);
		comboBox.addItem("Yunus");//yunusu copmboboxa ekledik
		comboBox.removeItem("Can");// Cani combobox tan cikardik
		comboBox.insertItemAt("Zafer", 2);
		contentPane.add(comboBox);
		
		JLabel lblAd = new JLabel("");
		lblAd.setBounds(241, 177, 292, 35);
		contentPane.add(lblAd);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBox.getSelectedItem());
				System.out.println(comboBox.getSelectedIndex());
				lblAd.setText(comboBox.getSelectedItem().toString());
			}
		});
		
		
	}
}
