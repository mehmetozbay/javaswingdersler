package ders9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditorPaneUyg extends JFrame {

	private JPanel contentPane;
	private JTextField txtLink;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorPaneUyg frame = new EditorPaneUyg();
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
	public EditorPaneUyg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 54, 334, 142);
		editorPane.setContentType("text/html");
//		contentPane.add(editorPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setViewportView(editorPane);
		scrollPane.setBounds(60, 37, 267, 142);
		contentPane.add(scrollPane);
		
		txtLink = new JTextField();
		txtLink.setBounds(28, 220, 349, 33);
		contentPane.add(txtLink);
		txtLink.setColumns(10);
		
		JButton btnAra = new JButton("Ara");
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url="<html><img src=\""+txtLink.getText()+"\"</img></html>";
				editorPane.setText(url);
			}
		});
		btnAra.setBounds(387, 220, 89, 28);
		contentPane.add(btnAra);
	}
}
