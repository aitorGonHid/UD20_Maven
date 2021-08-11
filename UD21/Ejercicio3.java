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

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private int b1Counter, b2Counter;
	
	public Ejercicio3() {
		setVisible(true);
		setTitle("Ejercicio 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 146);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel infoBoton1 = new JLabel("Boton1 tiene: " +b1Counter+ " pulsaciones");
		infoBoton1.setBounds(10, 11, 206, 14);
		contentPane.add(infoBoton1);
		
		JLabel infoBoton2 = new JLabel("Boton2 tiene: " +b2Counter+ " pulsaciones");
		infoBoton2.setBounds(221, 11, 206, 14);
		contentPane.add(infoBoton2);
		
		JButton boton1 = new JButton("Boton 1");
		boton1.setBounds(10, 35, 100, 23);
		contentPane.add(boton1);
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1Counter++;
				infoBoton1.setText("Boton1 tiene: "+b1Counter+" pulsaciones");
			}
		});
		
		JButton boton2 = new JButton("Boton 2");
		boton2.setBounds(221, 35, 100, 23);
		contentPane.add(boton2);
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2Counter++;
				infoBoton2.setText("Boton2 tiene: " +b2Counter+ " pulsaciones");
			}
		});
		
	}
}
