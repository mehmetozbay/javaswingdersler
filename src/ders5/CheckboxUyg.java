package ders5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckboxUyg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxUyg frame = new CheckboxUyg();
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
	public CheckboxUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxSartlar = new JCheckBox("Sartlari kabul ediyorum");
		chckbxSartlar.setForeground(new Color(0, 0, 128));
		chckbxSartlar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxSartlar.setBounds(228, 61, 293, 23);
		ImageIcon icon=new ImageIcon(getClass().getResource("/chc1.png"));
		chckbxSartlar.setIcon(icon);
		contentPane.add(chckbxSartlar);
		
		JButton btnGiris = new JButton("Giris");
		btnGiris.setBounds(228, 107, 151, 23);
		contentPane.add(btnGiris);
		btnGiris.setEnabled(false);
		chckbxSartlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxSartlar.isSelected()) {
					chckbxSartlar.setForeground(Color.green);
					btnGiris.setEnabled(true);
					chckbxSartlar.setText("Sartlari kabul ediyorum");
					ImageIcon icon=new ImageIcon(getClass().getResource("/chc2.png"));
					chckbxSartlar.setIcon(icon);
					
				}else {
					chckbxSartlar.setForeground(Color.red);
					btnGiris.setEnabled(false);
					chckbxSartlar.setText("Sartlari kabul etmiyorum");
					ImageIcon icon=new ImageIcon(getClass().getResource("/chc1.png"));
					chckbxSartlar.setIcon(icon);
				}
			}
		});
		
	}

}
