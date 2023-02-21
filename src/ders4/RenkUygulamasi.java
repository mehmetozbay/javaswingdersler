package ders4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RenkUygulamasi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RenkUygulamasi frame = new RenkUygulamasi();
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
	public RenkUygulamasi() {

		Integer sayilar[] = new Integer[256];
		for (int i = 0; i < sayilar.length; i++) {
         sayilar[i]=i;
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox cmbR = new JComboBox(sayilar);
		cmbR.setBounds(83, 63, 88, 22);
		contentPane.add(cmbR);

		JComboBox cmbG = new JComboBox(sayilar);
		cmbG.setBounds(215, 63, 88, 22);
		contentPane.add(cmbG);

		JComboBox cmbB = new JComboBox(sayilar);
		cmbB.setBounds(333, 63, 88, 22);
		contentPane.add(cmbB);

		JLabel lblRenk = new JLabel("");
		lblRenk.setBounds(37, 129, 422, 257);
		lblRenk.setOpaque(true);
		contentPane.add(lblRenk);

		JLabel lblNewLabel = new JLabel("Red");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(98, 41, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Green");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setBounds(227, 41, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Blue");
		lblNewLabel_2.setForeground(new Color(0, 0, 139));
		lblNewLabel_2.setBounds(333, 41, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		cmbR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblRenk.setBackground(new Color(cmbR.getSelectedIndex(),cmbG.getSelectedIndex(),cmbB.getSelectedIndex() ));
			}
		});
		
		cmbG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRenk.setBackground(new Color(cmbR.getSelectedIndex(),cmbG.getSelectedIndex(),cmbB.getSelectedIndex() ));
			}
		});
		cmbB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRenk.setBackground(new Color(cmbR.getSelectedIndex(),cmbG.getSelectedIndex(),cmbB.getSelectedIndex() ));
			}
		});
		
	}

}
