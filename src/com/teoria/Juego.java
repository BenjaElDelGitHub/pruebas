package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Juego {

	private JFrame frame;
	private int puntuacion=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego window = new Juego();
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
	public Juego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Campus FP\\Desktop\\dog.jpg"));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		ButtonGroup grupo = new ButtonGroup();
		
		JLabel lblNewLabel = new JLabel("Juego superchungo");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 219, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Puntuaci\u00F3n");
		lblNewLabel_1.setBounds(419, 22, 85, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPuntuacion = new JLabel(puntuacion+ " puntos");
		lblPuntuacion.setBounds(514, 22, 46, 14);
		frame.getContentPane().add(lblPuntuacion);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(20, 61, 742, 302);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFCu\u00E1l es la m\u00E1scara de red en una red de clase C?");
		lblNewLabel_2.setBounds(32, 5, 291, 16);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(328, 13, 0, 0);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(333, 13, 0, 0);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(338, 13, 0, 0);
		panel_1.add(label_2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("255.0.0.0");
		rdbtnNewRadioButton_1.setBounds(6, 49, 127, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("255.255.255.0");
		rdbtnNewRadioButton_2.setBounds(5, 75, 127, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("255.255.0.0");
		rdbtnNewRadioButton.setBounds(5, 101, 128, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("192.168.1.0");
		rdbtnNewRadioButton_3.setBounds(5, 127, 127, 23);
		panel_1.add(rdbtnNewRadioButton_3);
		
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton_2);
		grupo.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Responder");
		btnNewButton.setBounds(5, 157, 127, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()) {
					JOptionPane.showMessageDialog(btnNewButton, "Has conseguido 1 punto");
					puntuacion++;
					lblPuntuacion.setText(puntuacion+ " puntos");
				}
			}
		});
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(365, 37, 0, 0);
		panel_1.add(label_3);
		panel_1.add(btnNewButton);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(228, 65, 0, 0);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(233, 65, 0, 0);
		panel_1.add(label_5);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
	}

}
