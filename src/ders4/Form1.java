package ders4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtAd;
	static Form1 frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Form1();
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
	public Form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAd = new JLabel("Ad");
		lblAd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAd.setBounds(312, 145, 39, 40);
		contentPane.add(lblAd);

		txtAd = new JTextField();
		txtAd.setBounds(361, 155, 199, 27);
		contentPane.add(txtAd);
		txtAd.setColumns(10);

		JButton btnGiris = new JButton("Giris");
		btnGiris.setBounds(440, 212, 120, 32);
		contentPane.add(btnGiris);

		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				
				Form2 frm2 = new Form2(txtAd.getText());
				frm2.setVisible(true);
				frame.setVisible(false);
			}
		});
	}
}
