package ders9;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;

public class MousListenerUyg extends JFrame implements MouseListener {

	private JPanel contentPane;
	JLabel lblTikla;
	JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MousListenerUyg frame = new MousListenerUyg();
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
	public MousListenerUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblTikla = new JLabel("Tikla");
		lblTikla.setForeground(new Color(255, 255, 255));
		lblTikla.setBackground(new Color(178, 34, 34));
		lblTikla.setOpaque(true);
		lblTikla.setHorizontalAlignment(SwingConstants.CENTER);
		lblTikla.setFont(new Font("Verdana", Font.PLAIN, 23));
		lblTikla.setBounds(98, 73, 94, 37);
		contentPane.add(lblTikla);
		lblTikla.addMouseListener(this);

		separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(98, 111, 94, 9);
		separator.setVisible(false);
		contentPane.add(separator);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tiklandi");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		lblTikla.setBackground(Color.black);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		lblTikla.setBackground(new Color(178, 34, 34));
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		
		separator.setVisible(true);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		separator.setVisible(false);
	}
}
