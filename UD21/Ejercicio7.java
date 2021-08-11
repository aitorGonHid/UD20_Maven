package UD21_First_maven_project.UD21;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ejercicio7 extends JFrame {

	private JTextField monedaOut;
	private JTextField monedaIn;
	public Double factorConversion = 166.86;

	public Ejercicio7() {
		
		setVisible(true);
		setTitle("Ejercicio 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 110);
		getContentPane().setLayout(null);
		
		//textFields
		monedaIn = new JTextField();
		monedaIn.setText("0");
		monedaIn.setHorizontalAlignment(SwingConstants.CENTER);
		monedaIn.setBounds(65, 12, 86, 20);
		monedaIn.setColumns(10);
		getContentPane().add(monedaIn);
		
		monedaOut = new JTextField();
		monedaOut.setText("0");
		monedaOut.setHorizontalAlignment(SwingConstants.CENTER);
		monedaOut.setBounds(184, 12, 86, 20);
		monedaOut.setColumns(10);
		getContentPane().add(monedaOut);
		
		//labels
		JLabel ConverssionLabel = new JLabel("Convertir");
		ConverssionLabel.setBounds(10, 15, 64, 14);
		getContentPane().add(ConverssionLabel);
		
		JLabel arrowLabel = new JLabel(">>>");
		arrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		arrowLabel.setBounds(153, 15, 32, 14);
		getContentPane().add(arrowLabel);
		
		JLabel divisaLabel = new JLabel("pesetas");
		divisaLabel.setBounds(277, 12, 61, 20);
		getContentPane().add(divisaLabel);
		
		//buttons
		JButton convertirButton = new JButton("€   >>  pesetas");
		convertirButton.setBounds(10, 40, 133, 23);
		getContentPane().add(convertirButton);
		
		JButton cambioButton = new JButton("Cambio div.");
		cambioButton.setBounds(153, 40, 113, 23);
		getContentPane().add(cambioButton);
		
		//Este método cambia el tipo de conversion a realizar y limpia el campo de salida
		ActionListener cambioDivisa = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String divisaActual = divisaLabel.getText();
				
				if (divisaActual.equals("pesetas")) {
					divisaLabel.setText("€");
					convertirButton.setText("pesetas  >>   €");
					monedaOut.setText("");
				} else {
					divisaLabel.setText("pesetas");
					convertirButton.setText("€   >>  pesetas");
					monedaOut.setText("");
				}
			}
				
		};cambioButton.addActionListener(cambioDivisa);
		
		//Este método realiza el cambio de conversión que se ha indicado previamente
		ActionListener convertiMoneda = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String divisaActual = divisaLabel.getText();
				DecimalFormat df = new DecimalFormat("0.00");
				
				if (divisaActual.equals("pesetas")) {
					double conversion = Double.parseDouble(monedaIn.getText()) * factorConversion;
					monedaOut.setText(df.format(conversion));
				} else {
					double conversion = Double.parseDouble(monedaIn.getText()) / factorConversion;
					monedaOut.setText(df.format(conversion));
				}
			}
		};convertirButton.addActionListener(convertiMoneda);
		
	}
}
