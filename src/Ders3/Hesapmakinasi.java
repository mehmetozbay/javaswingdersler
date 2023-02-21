package Ders3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Hesapmakinasi extends JFrame {

	private JPanel contentPane;
	private JTextField txtHesap;

	private int islem;
	private double sayi, sonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hesapmakinasi frame = new Hesapmakinasi();
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
	public Hesapmakinasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 32, 32));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ImageIcon icon = new ImageIcon("images/calculator.png");
		setIconImage(icon.getImage());

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtHesap = new JTextField();
		txtHesap.setEditable(false);
		txtHesap.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtHesap.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHesap.setBounds(57, 45, 355, 48);
		contentPane.add(txtHesap);
		txtHesap.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 32, 32));
		panel.setBounds(57, 108, 355, 210);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 4, 5, 10));
		
		
		JLabel lblHesap = new JLabel("");
		lblHesap.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHesap.setForeground(Color.WHITE);
		lblHesap.setBounds(57, 11, 355, 28);
		contentPane.add(lblHesap);
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				txtHesap.setText(txtHesap.getText()+e.getActionCommand());
				giris(e.getActionCommand());
			}

		});
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn7.setBackground(new Color(60, 60, 60));
		btn7.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn7.setContentAreaFilled(false);
		btn7.setFocusPainted(false);
		panel.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn8.setFocusPainted(false);
		btn8.setContentAreaFilled(false);
		btn8.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn8.setBackground(new Color(60, 60, 60));
		panel.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn9.setFocusPainted(false);
		btn9.setContentAreaFilled(false);
		btn9.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn9.setBackground(new Color(60, 60, 60));
		panel.add(btn9);

		JButton btnTopla = new JButton("+");
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(txtHesap.getText());
				islem = 1;
				txtHesap.setText("");
				lblHesap.setText(sayi+" + ");
				
			}
		});
		btnTopla.setForeground(Color.WHITE);
		btnTopla.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnTopla.setFocusPainted(false);
		btnTopla.setContentAreaFilled(false);
		btnTopla.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnTopla.setBackground(new Color(60, 60, 60));
		panel.add(btnTopla);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn4.setFocusPainted(false);
		btn4.setContentAreaFilled(false);
		btn4.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn4.setBackground(new Color(60, 60, 60));
		panel.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn5.setFocusPainted(false);
		btn5.setContentAreaFilled(false);
		btn5.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn5.setBackground(new Color(60, 60, 60));
		panel.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn6.setFocusPainted(false);
		btn6.setContentAreaFilled(false);
		btn6.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn6.setBackground(new Color(60, 60, 60));
		panel.add(btn6);

		JButton btnAzalt = new JButton("-");
		btnAzalt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(txtHesap.getText());
				islem = 2;
				txtHesap.setText("");
				lblHesap.setText(sayi+" - ");
			}
		});
		btnAzalt.setForeground(Color.WHITE);
		btnAzalt.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnAzalt.setFocusPainted(false);
		btnAzalt.setContentAreaFilled(false);
		btnAzalt.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnAzalt.setBackground(new Color(60, 60, 60));
		panel.add(btnAzalt);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn1.setFocusPainted(false);
		btn1.setContentAreaFilled(false);
		btn1.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn1.setBackground(new Color(60, 60, 60));
		panel.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn2.setFocusPainted(false);
		btn2.setContentAreaFilled(false);
		btn2.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn2.setBackground(new Color(60, 60, 60));
		panel.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn3.setFocusPainted(false);
		btn3.setContentAreaFilled(false);
		btn3.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn3.setBackground(new Color(60, 60, 60));
		panel.add(btn3);

		JButton btnCarp = new JButton("*");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(txtHesap.getText());
				islem = 3;
				txtHesap.setText("");
				lblHesap.setText(sayi+" * ");
			}
		});
		btnCarp.setForeground(Color.WHITE);
		btnCarp.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnCarp.setFocusPainted(false);
		btnCarp.setContentAreaFilled(false);
		btnCarp.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnCarp.setBackground(new Color(60, 60, 60));
		panel.add(btnCarp);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btn0.setFocusPainted(false);
		btn0.setContentAreaFilled(false);
		btn0.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btn0.setBackground(new Color(60, 60, 60));
		panel.add(btn0);

		JButton btnNokta = new JButton(".");
		btnNokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giris(e.getActionCommand());
			}
		});
		btnNokta.setForeground(Color.WHITE);
		btnNokta.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnNokta.setFocusPainted(false);
		btnNokta.setContentAreaFilled(false);
		btnNokta.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnNokta.setBackground(new Color(60, 60, 60));
		panel.add(btnNokta);

		JButton btnEsittir = new JButton("=");
		btnEsittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesapla();

			}
		});
		btnEsittir.setForeground(Color.WHITE);
		btnEsittir.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnEsittir.setFocusPainted(false);
		btnEsittir.setContentAreaFilled(false);
		btnEsittir.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnEsittir.setBackground(new Color(60, 60, 60));
		panel.add(btnEsittir);

		JButton btnBol = new JButton("/");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sayi = Double.parseDouble(txtHesap.getText());
				islem = 4;
				txtHesap.setText("");
				lblHesap.setText(sayi+" / ");
			}
		});
		btnBol.setForeground(Color.WHITE);
		btnBol.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnBol.setFocusPainted(false);
		btnBol.setContentAreaFilled(false);
		btnBol.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnBol.setBackground(new Color(60, 60, 60));
		panel.add(btnBol);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHesap.setText("");
				lblHesap.setText("");
			}
		});
		btnC.setForeground(Color.WHITE);
		btnC.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnC.setFocusPainted(false);
		btnC.setContentAreaFilled(false);
		btnC.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnC.setBackground(new Color(60, 60, 60));
		panel.add(btnC);

		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String count = txtHesap.getText();
				if (count.length() > 0) {
					txtHesap.setText(count.substring(0, count.length() - 1));
				}

			}
		});
		btnDel.setForeground(Color.WHITE);
		btnDel.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		btnDel.setFocusPainted(false);
		btnDel.setContentAreaFilled(false);
		btnDel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnDel.setBackground(new Color(60, 60, 60));
		panel.add(btnDel);
		
		

	}

	private void giris(String str) {
		/// txt get Hesap ile textField deki alani aliriz
//		str ile yukaridan gonderdigimiz e.getActionCommand()(hangi tusa tikladiysak onun textini alir) i aliriz
		txtHesap.setText(txtHesap.getText() + str);
	}

	private void hesapla() {
		switch (islem) {
		case 1:
			sonuc = sayi + Double.parseDouble(txtHesap.getText());
			txtHesap.setText(Double.toString(sonuc));
			break;
		case 2:
			sonuc = sayi - Double.parseDouble(txtHesap.getText());
			txtHesap.setText(Double.toString(sonuc));
			break;
		case 3:
			sonuc = sayi * Double.parseDouble(txtHesap.getText());
			txtHesap.setText(Double.toString(sonuc));
			break;
		case 4:
			sonuc = sayi / Double.parseDouble(txtHesap.getText());
			txtHesap.setText(Double.toString(sonuc));
			break;
		default:
			break;
		}
	}
}
