package Ders2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class LabelForm2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabelForm2 frame = new LabelForm2();
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
	public LabelForm2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSave = new JLabel("");
		ImageIcon icon=new ImageIcon(getClass().getResource("/save.png"));
		lblSave.setIcon(icon);                          
//		                                                Renk      Kalinlik 
		lblSave.setBorder(BorderFactory.createDashedBorder(Color.red, 4, 2, 2, rootPaneCheckingEnabled));
		lblSave.setBounds(256, 49, 50, 67);
		contentPane.add(lblSave);
	}

}
