package ders5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PasswordFieldUyg extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordFieldUyg frame = new PasswordFieldUyg();
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
	public PasswordFieldUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsername.setBounds(259, 80, 126, 14);
		contentPane.add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setBounds(259, 105, 217, 26);
		txtUsername.setBorder(null);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);

		JLabel lblPass = new JLabel("Password");
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPass.setBounds(259, 142, 126, 14);
		contentPane.add(lblPass);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(259, 169, 217, 26);
		passwordField.setEchoChar('*');
		passwordField.setBorder(null);
		contentPane.add(passwordField);

		JButton btnGiris = new JButton("Giris");
		btnGiris.setBounds(387, 220, 89, 23);
		contentPane.add(btnGiris);

		JSeparator separatorUser = new JSeparator();
		separatorUser.setForeground(new Color(0, 0, 139));
		separatorUser.setBounds(259, 131, 217, 8);
		contentPane.add(separatorUser);

		JSeparator separatorPass = new JSeparator();
		separatorPass.setForeground(new Color(0, 0, 139));
		separatorPass.setBounds(259, 195, 217, 8);
		contentPane.add(separatorPass);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMessage.setBounds(259, 271, 267, 14);
		contentPane.add(lblMessage);
		
		JCheckBox chckbxGoster = new JCheckBox("");
		ImageIcon icon=new ImageIcon(getClass().getResource("/eyeclose.png"));
		chckbxGoster.setIcon(icon);
		chckbxGoster.setBounds(482, 173, 97, 23);
		contentPane.add(chckbxGoster);
		
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass=new String(passwordField.getPassword());
				lblMessage.setText(pass);
			}
		});
		chckbxGoster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxGoster.isSelected()) {
					ImageIcon icon=new ImageIcon(getClass().getResource("/eyeopen.png"));
					passwordField.setEchoChar((char) 0);
					chckbxGoster.setIcon(icon);
				} else {
					ImageIcon icon=new ImageIcon(getClass().getResource("/eyeclose.png"));
					chckbxGoster.setIcon(icon);
					passwordField.setEchoChar('*');
				}
			}
		});
		
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String sifre =new String(passwordField.getPassword());
				boolean sifreDogruMu=passControl(sifre);
				if (sifreDogruMu) {
					separatorPass.setForeground(Color.green);
				} else {
					separatorPass.setForeground(Color.red);
				}
				
			}
		});
	}
	
	public boolean passControl(String pass) {
		
		Pattern pattern=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
		Matcher matcher=pattern.matcher(pass);
		return matcher.matches();
		
	}
	
}
