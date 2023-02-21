package ders4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ButtonUygulamasi extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btn1, btn2;
	JLabel lblMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonUygulamasi frame = new ButtonUygulamasi();
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
	public ButtonUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btn1 = new JButton("1");
		btn1.setBounds(172, 103, 110, 45);
		contentPane.add(btn1);
		btn1.addActionListener(this);
		btn2 = new JButton("2");
		btn2.setBounds(172, 225, 110, 45);
		contentPane.add(btn2);
		btn2.addActionListener(this);
		lblMessage = new JLabel("");
		lblMessage.setForeground(new Color(255, 0, 0));
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMessage.setBounds(370, 177, 313, 45);
		contentPane.add(lblMessage);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn1) {
			lblMessage.setText("buton 1 e tiklandi");
		}
		if (e.getSource() == btn2) {
			lblMessage.setText("buton 2 e tiklandi");
		}
	}
}
