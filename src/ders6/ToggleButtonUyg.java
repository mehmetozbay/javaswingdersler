package ders6;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToggleButtonUyg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToggleButtonUyg frame = new ToggleButtonUyg();
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
	public ToggleButtonUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnDegis = new JToggleButton("Renk Degis");
		tglbtnDegis.setBounds(208, 77, 121, 23);
		contentPane.add(tglbtnDegis);
		
		JLabel lblRenk = new JLabel("");
		lblRenk.setBounds(168, 131, 259, 110);
		lblRenk.setOpaque(true);
		contentPane.add(lblRenk);
		tglbtnDegis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnDegis.isSelected()) {
					lblRenk.setBackground(Color.green);
					System.out.println("basildi");
				} else {
					lblRenk.setBackground(Color.red);
					System.out.println("cekildi");
				}
				
			}
		});
		
	}
}
