package ders7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableUyg extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblId;
	private JTextField txtId;
	private JLabel lblAd;
	private JTextField txtAd;
	private JButton btnEkle;
	private JButton btnSil;
	private JButton btnGuncelle;
	private List<User> users = new ArrayList<>();
	private DefaultTableModel userModel;
	private Object[] userRowData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableUyg frame = new TableUyg();
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
	public TableUyg() {
		userModel = new DefaultTableModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable(userModel);

//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null},
//				{null, null},
//				{null, null},
//				{null, null},
//				{null, null},
//				{null, null},
//			},
//			new String[] {
//				"id", "Ad Soyad"
//			}
//		));

		Object[] colUsers = new Object[2];
		colUsers[0] = "ID";
		colUsers[1] = "Ad";

		userModel.setColumnIdentifiers(colUsers);

		table.setBounds(76, 48, 224, 184);
//		contentPane.add(table);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(58, 40, 270, 252);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);

		lblId = new JLabel("ID");
		lblId.setBounds(394, 47, 46, 14);
		contentPane.add(lblId);

		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(450, 44, 135, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		lblAd = new JLabel("Ad");
		lblAd.setBounds(394, 84, 46, 14);
		contentPane.add(lblAd);

		txtAd = new JTextField();
		txtAd.setBounds(450, 81, 135, 20);
		contentPane.add(txtAd);
		txtAd.setColumns(10);

		btnEkle = new JButton("Ekle");
		btnEkle.setBounds(374, 127, 89, 31);
		contentPane.add(btnEkle);

		btnSil = new JButton("Sil");
		btnSil.setBounds(473, 127, 89, 31);
		contentPane.add(btnSil);

		btnGuncelle = new JButton("Guncelle");

		btnGuncelle.setBounds(572, 127, 89, 31);
		contentPane.add(btnGuncelle);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtId.setText(userModel.getValueAt(table.getSelectedRow(), 0).toString());
				txtAd.setText(userModel.getValueAt(table.getSelectedRow(), 1).toString());
			}
		});
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtId.getText().isEmpty()) {
					System.out.println("test");
					int id = Integer.parseInt(txtId.getText());
					for (int i = 0; i < users.size(); i++) {
						if (id == users.get(i).getId()) {
							users.remove(i);
							listele();
							temizle();
						}
					}
				}

			}
		});

		btnGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!txtId.getText().isEmpty()) {
					int id = Integer.parseInt(txtId.getText());
					User user = new User(id, txtAd.getText());
					for (int i = 0; i < users.size(); i++) {
						if (id == users.get(i).getId()) {
							users.set(i, user);
							listele();
							temizle();
						}
					}

				}
			}
		});
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				User user = new User(txtAd.getText());
				users.add(user);
				System.out.println(user.getId());
				listele();
				temizle();
			}
		});
	}

	private void temizle() {
		txtId.setText("");
		txtAd.setText("");
	}

	private void listele() {
		userModel.setRowCount(0);
		userRowData = new Object[2];
		for (int i = 0; i < users.size(); i++) {
			userRowData[0] = users.get(i).getId();
			userRowData[1] = users.get(i).getAd();
			userModel.addRow(userRowData);
		}
	}

}
