package app.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import kontroleri.StudentController;


public class AddingDialog extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel contentPanel = new JPanel();
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JComboBox<String> comboBox;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static String SelectedButton;
	/**
	 * Launch the application.
	 */

	public static void AddScreen() {
		try {

			AddingDialog dialog = new AddingDialog();
			dialog.setTitle("Podaci o novom studentu");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */



	public AddingDialog() {


		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 526, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ime*");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 15, 122, 14);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Prezime*");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(47, 30, 122, 14);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Datum Rodjenja*");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(47, 45, 122, 14);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Adresa Stanovanja*");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(47, 60, 122, 14);
		contentPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Broj Telefona*");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(47, 75, 122, 14);
		contentPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Email*");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(47, 90, 122, 14);
		contentPanel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Trenutna Godina Studija*");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(26, 177, 159, 14);
		contentPanel.add(lblNewLabel_6);

		JRadioButton budzet = new JRadioButton("Budzet");
		budzet.setActionCommand(budzet.getText());
		budzet.setBounds(37, 198, 86, 23);
		contentPanel.add(budzet);

		JRadioButton samofinansiranje = new JRadioButton("Samofinansiranje");
		samofinansiranje.setActionCommand(samofinansiranje.getText());
		samofinansiranje.setBounds(189, 198, 107, 23);
		samofinansiranje.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (samofinansiranje.isSelected()) {
					budzet.setSelected(false);
					SelectedButton = "S";
				}
			}
		});
		contentPanel.add(samofinansiranje);

		budzet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (budzet.isSelected()) {
					samofinansiranje.setSelected(false);
					SelectedButton = "B";
				}
			}
		});



		textField = new JTextField();
		textField.setBounds(189, 15, 188, 14);
		contentPanel.add(textField);
		textField.setColumns(10);


		textField_1 = new JTextField();
		textField_1.setBounds(189, 30, 188, 14);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);


		textField_2 = new JTextField();
		textField_2.setBounds(189, 45, 188, 14);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(189, 60, 188, 14);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);


		textField_4 = new JTextField();
		textField_4.setBounds(189, 75, 188, 14);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);


		textField_5 = new JTextField();
		textField_5.setBounds(189, 90, 188, 14);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);


		textField_6 = new JTextField();
		textField_6.setBounds(189, 105, 188, 14);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);


		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(189, 120, 188, 14);
		contentPanel.add(textField_7);


		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(189, 135, 188, 14);
		contentPanel.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(189, 150, 188, 14);
		contentPanel.add(textField_9);


		comboBox = new JComboBox<String>();
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(189, 173, 188, 22);
		contentPanel.add(comboBox);





		JLabel lblBrojIndeksa = new JLabel("Broj Indeksa*");
		lblBrojIndeksa.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrojIndeksa.setBounds(47, 105, 122, 14);
		contentPanel.add(lblBrojIndeksa);

		JLabel lblDatumUpisa = new JLabel("Datum Upisa*");
		lblDatumUpisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatumUpisa.setBounds(47, 120, 122, 14);
		contentPanel.add(lblDatumUpisa);

		JLabel lblProsecnaOcena = new JLabel("Prosecna Ocena*");
		lblProsecnaOcena.setHorizontalAlignment(SwingConstants.CENTER);
		lblProsecnaOcena.setBounds(47, 135, 122, 14);
		contentPanel.add(lblProsecnaOcena);

		JLabel lblPredmeti = new JLabel("Predmeti*");
		lblPredmeti.setHorizontalAlignment(SwingConstants.CENTER);
		lblPredmeti.setBounds(47, 150, 122, 14);
		contentPanel.add(lblPredmeti);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						StudentController.getInstance().dodajStudenta();

						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);

			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
			}
		}

	}
	public static  ArrayList<String> dodavanje(){
		ArrayList<String> delovi = new ArrayList<String>();
		delovi.add(textField.getText());
		delovi.add(textField_1.getText());
		delovi.add(textField_2.getText());
		delovi.add(textField_3.getText());
		delovi.add(textField_4.getText());
		delovi.add(textField_5.getText());
		delovi.add(textField_6.getText());
		delovi.add(textField_7.getText());
		delovi.add((String) comboBox.getSelectedItem());
		delovi.add(SelectedButton);
		delovi.add(textField_8.getText());
		delovi.add(textField_9.getText());


		return delovi;
	}



}
