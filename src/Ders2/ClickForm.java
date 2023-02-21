package Ders2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ClickForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClickForm frame = new ClickForm();
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
	public ClickForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTikla = new JButton("Tikla");
		btnTikla.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTikla.setBounds(256, 80, 220, 42);
		contentPane.add(btnTikla);
		
		JLabel lblSonuc = new JLabel("");
		lblSonuc.setForeground(new Color(199, 21, 133));
		lblSonuc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSonuc.setBounds(283, 170, 187, 42);
		contentPane.add(lblSonuc);
		btnTikla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblSonuc.setText("Butona tiklandi");
			}
		});
		
		
	}

}
