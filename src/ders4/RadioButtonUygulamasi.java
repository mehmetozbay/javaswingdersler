package ders4;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButtonUygulamasi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonUygulamasi frame = new RadioButtonUygulamasi();
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
	public RadioButtonUygulamasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnBay = new JRadioButton("Bay");
		
		rdbtnBay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnBay.setForeground(new Color(0, 0, 255));
		ImageIcon icon=new ImageIcon(getClass().getResource("/man.png"));
		rdbtnBay.setIcon(icon);
		rdbtnBay.setSelected(true);
		rdbtnBay.setBounds(93, 70, 144, 49);
		contentPane.add(rdbtnBay);
		
		JRadioButton rdbtnBayan = new JRadioButton("Bayan");
		rdbtnBayan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnBayan.setForeground(new Color(255, 20, 147));
		rdbtnBayan.setBounds(313, 70, 144, 49);
		ImageIcon icon2=new ImageIcon(getClass().getResource("/woman.png"));
		rdbtnBayan.setIcon(icon2);
		contentPane.add(rdbtnBayan);
		
		ButtonGroup btnGroup=new ButtonGroup();
		btnGroup.add(rdbtnBayan);
		btnGroup.add(rdbtnBay);
		
		rdbtnBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Bay tiklandi");
			}
		});
		
		rdbtnBayan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bayan tiklandi");
			}
		});
		
	}

}
