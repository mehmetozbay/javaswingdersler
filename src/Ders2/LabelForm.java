package Ders2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class LabelForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabelForm frame = new LabelForm();
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
	public LabelForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMerhaba = new JLabel("");
		lblMerhaba.setForeground(new Color(224, 255, 255));
		lblMerhaba.setBackground(new Color(112, 128, 144));
		ImageIcon icon =new ImageIcon(getClass().getResource("/register.png"));
		lblMerhaba.setIcon(icon);
		lblMerhaba.setOpaque(true);
		lblMerhaba.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 17));
		lblMerhaba.setBounds(156, 27, 64, 74);
		contentPane.add(lblMerhaba);
	}

}
