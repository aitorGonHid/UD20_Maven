package UD21_First_maven_project.UD21;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	public Ejercicio1() {
		
		setVisible(true);
		setTitle("Ejercicio1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 436);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta = new JLabel("LABEL");
		etiqueta.setVerticalAlignment(SwingConstants.TOP);
		etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta.setBounds(10, 69, 447, 317);
		contentPane.add(etiqueta);
		
		JLabel lblNewLabel = new JLabel("Cambiar tamaño etiqueta");
		lblNewLabel.setBounds(10, 44, 131, 14);
		contentPane.add(lblNewLabel);
		
		JButton aumentar = new JButton("+");
		aumentar.setBounds(10, 10, 41, 23);
		contentPane.add(aumentar);
		aumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aug) {
				etiqueta.setFont(new Font("Tahoma", Font.PLAIN,etiqueta.getFont().getSize()+1));
			}
		});
		
		
		JButton reducir = new JButton("-");
		reducir.setBounds(65, 10, 41, 23);
		contentPane.add(reducir);
		reducir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setFont(new Font("Tahoma", Font.PLAIN,etiqueta.getFont().getSize()-1));
			}
		});	
	}
}
