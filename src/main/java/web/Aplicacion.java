package web;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import persistencia.dominio.TipoDoc;
import javax.swing.JRadioButton;
import javax.swing.JPanel;

public class Aplicacion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion window = new Aplicacion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aplicacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(132, 12, 304, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 43, 304, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 74, 304, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(132, 105, 304, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(132, 136, 304, 19);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(22, 14, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		label = new JLabel("New label");
		label.setBounds(22, 76, 70, 15);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("New label");
		label_1.setBounds(22, 45, 70, 15);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("New label");
		label_2.setBounds(22, 138, 70, 15);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("New label");
		label_3.setBounds(22, 107, 70, 15);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("New label");
		label_4.setBounds(22, 174, 70, 15);
		frame.getContentPane().add(label_4);
		
		final JComboBox<TipoDoc> comboBox = new JComboBox<TipoDoc>();
		comboBox.setBounds(132, 169, 304, 24);
		comboBox.setModel(new DefaultComboBoxModel<>(TipoDoc.values()));
		
		frame.getContentPane().add(comboBox);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(190, 288, 117, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton buttonAceptar = new JButton("Aceptar");
		buttonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(textField.getText());
				System.out.println(textField_1.getText());
				System.out.println(textField_2.getText());
				System.out.println(textField_3.getText());
				System.out.println(textField_4.getText());
				System.out.println(comboBox.getSelectedItem().toString());
								
			}
		});
		buttonAceptar.setBounds(319, 288, 117, 25);
		frame.getContentPane().add(buttonAceptar);
		
		label_5 = new JLabel("New label");
		label_5.setBounds(22, 206, 70, 15);
		frame.getContentPane().add(label_5);
		
		panel = new JPanel();
		panel.setBounds(132, 201, 291, 24);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnA = new JRadioButton("AAAAA");
		rdbtnA.setBounds(0, 0, 124, 23);
		panel.add(rdbtnA);
		rdbtnA.setSelected(true);
		
		JRadioButton rdbtnB = new JRadioButton("BBBBB");
		rdbtnB.setBounds(142, 1, 149, 23);
		panel.add(rdbtnB);
		
		
	}
}
