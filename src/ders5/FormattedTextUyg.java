package ders5;

import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import java.awt.Font;

public class FormattedTextUyg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormattedTextUyg frame = new FormattedTextUyg();
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
	public FormattedTextUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
//		# sayilar
//		U buyuk harfler
//		L kucuk harfler
//		AA hepsi
		try {
//			MaskFormatter maskFormatter=new MaskFormatter("(0###) ### ## ##");
			MaskFormatter maskFormatter=new MaskFormatter("AA UU LL ##");
			JFormattedTextField formattedTextField = new JFormattedTextField(maskFormatter);
			formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
			formattedTextField.setBounds(187, 73, 305, 28);
			contentPane.add(formattedTextField);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
