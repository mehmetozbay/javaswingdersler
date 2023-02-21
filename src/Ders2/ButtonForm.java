package Ders2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class ButtonForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonForm frame = new ButtonForm();
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
	public ButtonForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1025, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(176, 224, 230));
		ImageIcon icon=new ImageIcon(getClass().getResource("/save.png"));
		btnLogin.setIcon(icon);
		btnLogin.setBorder(BorderFactory.createLineBorder(Color.blue,3));
		btnLogin.setFocusPainted(false);
		btnLogin.setForeground(new Color(106, 90, 205));
		btnLogin.setFont(new Font("Trebuchet MS", Font.ITALIC, 16));
		btnLogin.setBounds(354, 121, 215, 64);
		contentPane.add(btnLogin);
	}

}
