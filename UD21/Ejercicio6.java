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

public class Ejercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField campoPeso;
	private JTextField campoAltura;
	private JTextField campoImc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
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
	public Ejercicio6() {
		setVisible(true);
		setTitle("Ejercicio 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CAMPOS DE TEXTO
		campoAltura = new JTextField();
		campoAltura.setBounds(170, 12, 86, 20);
		campoAltura.setColumns(10);
		contentPane.add(campoAltura);
		
		campoPeso = new JTextField();
		campoPeso.setBounds(170, 38, 86, 20);
		contentPane.add(campoPeso);
		campoPeso.setColumns(10);
				
		campoImc = new JTextField();
		campoImc.setBounds(170, 66, 86, 20);
		campoImc.setColumns(10);
		contentPane.add(campoImc);
		
		//ETIQUETAS
		JLabel altura = new JLabel("Altura (metros)");
		altura.setBounds(30, 15, 93, 14);
		contentPane.add(altura);
		
		JLabel peso = new JLabel("Peso (kg)");
		peso.setBounds(30, 41, 93, 14);
		contentPane.add(peso);
		
		JButton calcular = new JButton("Calcular IMC");
		calcular.setBounds(10, 65, 113, 23);
		contentPane.add(calcular);
		calcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("##.00");
				double peso = Double.parseDouble(campoPeso.getText());
				double altura = Double.parseDouble(campoAltura.getText());
				double imc = peso / Math.pow(altura, 2);
				campoImc.setText(df.format(imc));
			}
		});
		
	}

}
