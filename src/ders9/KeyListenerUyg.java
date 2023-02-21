package ders9;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class KeyListenerUyg extends JFrame implements KeyListener{

	private JPanel contentPane;
	JLabel lblUcak;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyListenerUyg frame = new KeyListenerUyg();
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
	public KeyListenerUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		addKeyListener(this);
		 lblUcak = new JLabel("");
		ImageIcon icon =new ImageIcon(getClass().getResource("/ucak.png"));
		lblUcak.setIcon(icon);
		lblUcak.setBounds(157, 219, 48, 48);
		contentPane.add(lblUcak);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyChar()) {
		case 'a':
			if(lblUcak.getX()>0)
			lblUcak.setLocation(lblUcak.getX()-10, lblUcak.getY());
			break;
//			589=Formun genisligi-lblUcakGenisligi=651-62
		case 'd':
			if(lblUcak.getX()<589)
			lblUcak.setLocation(lblUcak.getX()+10, lblUcak.getY());
			break;
		case 'w':
			if(lblUcak.getY()>0)
			lblUcak.setLocation(lblUcak.getX(), lblUcak.getY()-10);
			break;
		case 's':
			if(lblUcak.getY()<418-96)
			lblUcak.setLocation(lblUcak.getX(), lblUcak.getY()+10);
			break;
		default:
			break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37:
			if(lblUcak.getX()>0)
			lblUcak.setLocation(lblUcak.getX()-10, lblUcak.getY());
			break;
//			589=Formun genisligi-lblUcakGenisligi=651-62
		case 39:
			if(lblUcak.getX()<589)
			lblUcak.setLocation(lblUcak.getX()+10, lblUcak.getY());
			break;
		case 38: 
			if(lblUcak.getY()>0)
			lblUcak.setLocation(lblUcak.getX(), lblUcak.getY()-10);
			break;
		case 40:
			if(lblUcak.getY()<418-96)
			lblUcak.setLocation(lblUcak.getX(), lblUcak.getY()+10);
			break;
		default:
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tusu biraktin "+e.getKeyChar());
		System.out.println("Tusu biraktin "+e.getKeyCode());
	}

}
