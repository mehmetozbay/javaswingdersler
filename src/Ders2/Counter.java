package Ders2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Counter extends JFrame {

	private JPanel contentPane;

	private int sayi=0;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter();
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
	public Counter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAzalt = new JButton("-");
		btnAzalt.setBackground(new Color(220, 20, 60));
		btnAzalt.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnAzalt.setFocusPainted(false);
		btnAzalt.setBounds(173, 123, 80, 56);
		contentPane.add(btnAzalt);
		
		JLabel lblCount = new JLabel("0");
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setFont(new Font("Yu Gothic UI", Font.PLAIN, 54));
		lblCount.setBounds(263, 118, 153, 61);
		contentPane.add(lblCount);
		
		JButton btnArttir = new JButton("+");
		btnArttir.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnArttir.setFocusPainted(false);
		btnArttir.setBackground(new Color(50, 205, 50));
		btnArttir.setBounds(409, 123, 80, 56);
		contentPane.add(btnArttir);
		
		btnArttir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sayi++;
				lblCount.setText(String.valueOf(sayi));
				System.out.println(sayi);
				
			}
		});
		
		
		btnAzalt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(sayi>0) {
					sayi--;
					lblCount.setText(String.valueOf(sayi));
					System.out.println(sayi);
				}
			}
		});
		
		
		
		
		
		
		
		
		
	}

}
