package UD21_First_maven_project.UD21;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	
	public Ejercicio2() {
		setVisible(true);
		setTitle("Ejercicio 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 146);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel infoBotonPulsado = new JLabel("Has pulsado el boton:   NONE");
		infoBotonPulsado.setBounds(10, 39, 203, 14);
		contentPane.add(infoBotonPulsado);
		
		JButton boton1 = new JButton("Boton 1");
		boton1.setBounds(223, 35, 100, 23);
		contentPane.add(boton1);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoBotonPulsado.setText("Has pulsado el boton:   BOTON 1");				
			}
		});
		
		JButton boton2 = new JButton("Boton 2");
		boton2.setBounds(327, 35, 100, 23);
		contentPane.add(boton2);
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoBotonPulsado.setText("Has pulsado el boton:   BOTON 2");
			}
		});
		
	}
}
