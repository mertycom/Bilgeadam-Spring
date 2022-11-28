package com.bilgeadam.spring.lesson01.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.awt.event.ActionEvent;

public class OdemeFormu {

	private JFrame frame;
	private JTextField txtTutar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OdemeFormu window = new OdemeFormu();
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
	public OdemeFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox cmbOdemeYontemi = new JComboBox();
		cmbOdemeYontemi.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "Kredi Karti", "Mail Order"}));
		cmbOdemeYontemi.setBounds(208, 40, 111, 29);
		frame.getContentPane().add(cmbOdemeYontemi);
		
		JLabel lblOdemeYontemi = new JLabel("Ödeme Yönteme");
		lblOdemeYontemi.setBounds(78, 43, 104, 22);
		frame.getContentPane().add(lblOdemeYontemi);
		
		JLabel lblTutar = new JLabel("Tutar");
		lblTutar.setBounds(78, 91, 104, 22);
		frame.getContentPane().add(lblTutar);
		
		txtTutar = new JTextField();
		txtTutar.setBounds(208, 88, 111, 29);
		frame.getContentPane().add(txtTutar);
		txtTutar.setColumns(10);
		

		
		JLabel lblSonuc = new JLabel("...");
		lblSonuc.setBounds(10, 200, 416, 52);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnOdemeYap = new JButton("Ödeme Yap");
		btnOdemeYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String istek = cmbOdemeYontemi.getSelectedItem().toString();
				Double tutar = Double.valueOf(txtTutar.getText());
				
				OdemeFactory of = new OdemeFactory();
				
				try {
					OdemeIslemi odemeIslemi = new OdemeIslemi(of.getType("com.bilgeadam.spring.lesson01.swing."+istek.replaceAll("\s+","")));
					lblSonuc.setText(odemeIslemi.ode(tutar));
				} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
						| IllegalArgumentException | InvocationTargetException | NoSuchMethodException
						| SecurityException e1) {
					
					e1.printStackTrace();
				}
					
				
				
				
				
			}
		});
		
		btnOdemeYap.setBounds(217, 141, 89, 23);
		frame.getContentPane().add(btnOdemeYap);

	}
}
