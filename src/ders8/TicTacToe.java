package ders8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {

	private JPanel contentPane;

	JPanel pnlOyun;
	JButton[] buttons = new JButton[9];
	Random random = new Random();
	JLabel lblOyuncu;
	boolean oyuncuX;
	JButton btnRestart;
	JLabel lblOyuncuXSkor;
	JLabel lblOyuncuOSkor;
	int skorX = 0, skorO = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 535);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 22, 39));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		pnlOyun = new JPanel();
		pnlOyun.setBackground(new Color(255, 255, 255));
		pnlOyun.setBounds(27, 90, 501, 349);
		contentPane.add(pnlOyun);
		pnlOyun.setLayout(new GridLayout(3, 3, 10, 10));

		JPanel pnlSkor = new JPanel();
		pnlSkor.setBackground(new Color(255, 255, 255));
		pnlSkor.setBounds(566, 90, 370, 349);
		contentPane.add(pnlSkor);
		pnlSkor.setLayout(null);

		JLabel lblOyuncuXText = new JLabel("Oyuncu X =");
		lblOyuncuXText.setHorizontalAlignment(SwingConstants.LEFT);
		lblOyuncuXText.setForeground(new Color(255, 159, 27));
		lblOyuncuXText.setFont(new Font("Chiller", Font.BOLD, 32));
		lblOyuncuXText.setBounds(10, 38, 132, 38);
		pnlSkor.add(lblOyuncuXText);

		JLabel lblOyuncuOText = new JLabel("Oyuncu O = ");
		lblOyuncuOText.setHorizontalAlignment(SwingConstants.LEFT);
		lblOyuncuOText.setForeground(new Color(255, 159, 27));
		lblOyuncuOText.setFont(new Font("Chiller", Font.BOLD, 32));
		lblOyuncuOText.setBounds(10, 120, 144, 38);
		pnlSkor.add(lblOyuncuOText);

		lblOyuncuXSkor = new JLabel("0");
		lblOyuncuXSkor.setHorizontalAlignment(SwingConstants.LEFT);
		lblOyuncuXSkor.setForeground(new Color(255, 159, 27));
		lblOyuncuXSkor.setFont(new Font("Chiller", Font.BOLD, 32));
		lblOyuncuXSkor.setBounds(152, 38, 132, 38);
		pnlSkor.add(lblOyuncuXSkor);

		lblOyuncuOSkor = new JLabel("0");
		lblOyuncuOSkor.setHorizontalAlignment(SwingConstants.LEFT);
		lblOyuncuOSkor.setForeground(new Color(255, 159, 27));
		lblOyuncuOSkor.setFont(new Font("Chiller", Font.BOLD, 32));
		lblOyuncuOSkor.setBounds(152, 120, 132, 38);
		pnlSkor.add(lblOyuncuOSkor);

		 btnRestart = new JButton("Restart");
		btnRestart.setBackground(new Color(46, 196, 182));
		btnRestart.setForeground(new Color(0, 22, 39));
		btnRestart.setFont(new Font("Chiller", Font.BOLD, 28));
		btnRestart.setFocusPainted(false);
		btnRestart.setBounds(10, 193, 166, 49);
		btnRestart.setBorder(BorderFactory.createLineBorder(new Color(255, 159, 27), 2));
		pnlSkor.add(btnRestart);
		btnRestart.addActionListener(this);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 29, 54));
		panel.setBounds(0, 0, 1019, 38);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTitle = new JLabel("Tic Tac Toe");
		lblTitle.setForeground(new Color(0, 22, 39));
		lblTitle.setFont(new Font("Chiller", Font.BOLD, 32));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 0, 959, 38);
		panel.add(lblTitle);

		lblOyuncu = new JLabel("Oyuncu ");
		lblOyuncu.setHorizontalAlignment(SwingConstants.LEFT);
		lblOyuncu.setForeground(new Color(255, 159, 27));
		lblOyuncu.setFont(new Font("Chiller", Font.BOLD, 32));
		lblOyuncu.setBounds(27, 49, 171, 30);
		contentPane.add(lblOyuncu);

		JLabel lblSkorTablosu = new JLabel("Skor Tablosu");
		lblSkorTablosu.setHorizontalAlignment(SwingConstants.LEFT);
		lblSkorTablosu.setForeground(new Color(255, 159, 27));
		lblSkorTablosu.setFont(new Font("Chiller", Font.BOLD, 32));
		lblSkorTablosu.setBounds(566, 49, 273, 30);
		contentPane.add(lblSkorTablosu);
		oyunTahtaOlustur();
		ilkTur();
	}

	private void oyunTahtaOlustur() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setBackground(new Color(46, 196, 182));
			buttons[i].setForeground(new Color(0, 22, 39));
			buttons[i].setFont(new Font("Chiller", Font.BOLD, 32));
			buttons[i].setFocusPainted(false);
			buttons[i].setBorder(BorderFactory.createLineBorder(new Color(255, 159, 27), 2));
			buttons[i].addActionListener(this);
			pnlOyun.add(buttons[i]);

		}
	}

	private void ilkTur() {

		if (random.nextInt(2) == 0) {
			oyuncuX = true;
			lblOyuncu.setText("Oyuncu X");

		} else {
			oyuncuX = false;
			lblOyuncu.setText("Oyuncu O");

		}
	}

	private void kontrolEt() {
		// TODO Auto-generated method stub

		if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X") {
			kazananX(0, 1, 2);
		}
		if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X") {
			kazananX(3, 4, 5);
		}
		if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X") {
			kazananX(6, 7, 8);
		}
		if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X") {
			kazananX(0, 3, 6);
		}
		if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X") {
			kazananX(1, 4, 7);
		}
		if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X") {
			kazananX(2, 5, 8);
		}
		if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
			kazananX(0, 4, 8);
		}
		if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X") {
			kazananX(2, 4, 6);
		}

//		==========================Kontrol O=======================================
		if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O") {
			kazananO(0, 1, 2);
		}
		if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O") {
			kazananO(3, 4, 5);
		}
		if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O") {
			kazananO(6, 7, 8);
		}
		if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O") {
			kazananO(0, 3, 6);
		}
		if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O") {
			kazananO(1, 4, 7);
		}
		if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O") {
			kazananO(2, 5, 8);
		}
		if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
			kazananO(0, 4, 8);
		}
		if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O") {
			kazananO(2, 4, 6);
		}

	}

	private void kazananX(int a, int b, int c) {

		buttons[a].setBackground(Color.green);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);

		skorX++;
		lblOyuncuXSkor.setText(Integer.toString(skorX));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setEnabled(false);
		}

	}

	private void kazananO(int a, int b, int c) {
	
		buttons[a].setBackground(Color.green);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);
		skorO++;
		lblOyuncuOSkor.setText(Integer.toString(skorO));
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnRestart) {
//			for (int i = 0; i < buttons.length; i++) {
//				pnlOyun.remove(buttons[i]);
//			}
			pnlOyun.removeAll();
			pnlOyun.repaint();
			pnlOyun.revalidate();
			oyunTahtaOlustur();
		}
		
		
		
		
		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i]) {
				if (oyuncuX) {
					if (buttons[i].getText() == "") {
						buttons[i].setText("X");
						buttons[i].setForeground(Color.red);
						oyuncuX = false;
						lblOyuncu.setText("Oyuncu O");
						kontrolEt();
					}
				} else {
					if (buttons[i].getText() == "") {
						buttons[i].setText("O");
						buttons[i].setForeground(Color.white);
						oyuncuX = true;
						lblOyuncu.setText("Oyuncu X");
						kontrolEt();
					}
				}
			}
		}
		
		
		

	}

}
