package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;



import javax.swing.event.ChangeEvent;

public class Prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
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
	public Prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(21, 29, 252, 105);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Sevilla", "Valencia", "C\u00F3rdoba", "La Coru\u00F1a"}));
		panel.add(comboBox);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(45, 189, 179, 25);
		frame.getContentPane().add(splitPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(320, 11, 407, 412);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Inscribirme");
		tglbtnNewToggleButton.setEnabled(false);
		tglbtnNewToggleButton.setBounds(255, 114, 121, 23);
		panel_1.add(tglbtnNewToggleButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto la pol\u00EDtica de privacidad");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					tglbtnNewToggleButton.setEnabled(true);
				}
				else {
					tglbtnNewToggleButton.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox.setBounds(6, 21, 173, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Deseo recibir informaci\u00F3n comercial");
		chckbxNewCheckBox_1.setBounds(6, 54, 223, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel = new JLabel("\u00BFQu\u00E9 cursar?");
		lblNewLabel.setBounds(10, 106, 121, 14);
		panel_1.add(lblNewLabel);
		
		ButtonGroup grupo = new ButtonGroup();
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 298, 121, 103);
		panel_1.add(textPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DAM");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("Horario 1");
			}
		});
		rdbtnNewRadioButton.setBounds(6, 142, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("DAW");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("Horario 2");
			}
		});
		rdbtnNewRadioButton_1.setBounds(6, 168, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("ASIR");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("Horario 3");
			}
		});
		rdbtnNewRadioButton_2.setBounds(6, 194, 109, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(235, 23, 162, 80);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (list.getSelectedValue().toString()) {
				case "Java","Python","C#":
					JOptionPane.showMessageDialog(null, "Existe certificación opcional");
					break;
				} 
			}
		});
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Java", "Python", "C#", "JavaScript", "TypeScript", "VB.NET"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
	
		
	
		
		JLabel lblNewLabel_1 = new JLabel("Observaciones");
		lblNewLabel_1.setBounds(6, 274, 109, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(477, 424, 407, 315);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Campus FP\\Desktop\\dog.jpg"));
		frame.setBounds(100, 100, 1197, 724);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_2.setBounds(400, 400, slider.getValue()*2, slider.getValue()*2);
			}
		});
		slider.setBounds(197, 375, 200, 26);
		panel_1.add(slider);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Modo Noche");
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton_1.isSelected()) {
					panel_1.setBackground(Color.gray);
				}
				else {
					panel_1.setBackground(Color.white);
				}
			}
		});
		tglbtnNewToggleButton_1.setBounds(255, 168, 121, 23);
		panel_1.add(tglbtnNewToggleButton_1);
		
		
	}
}
