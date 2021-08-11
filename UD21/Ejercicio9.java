package UD21_First_maven_project.UD21;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Color;

public class Ejercicio9 extends JFrame {

	//Variables
	public static char[] colores = {'r', 'g', 'b', 'y', 'w', 'k', 'o', 'm'}; // Array de colores : red, green, blue, yellow, white, black, orange, pink
	public static ArrayList<JToggleButton> botonesList = new ArrayList<>(); // ArrayList de botones
	public static Random rand = new Random();
	public static char[] distribution;
	public static Color color1 = null;
	public static Color color2 = null;	
	public static int giradas = 0;
//	public static JToggleButton firstClick = null;
//	public static JToggleButton secondClick = null;
	
	public Ejercicio9() {
		
		//Ventana
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 460);
		setVisible(true);
		
		//Botones
		JToggleButton a1 = new JToggleButton("");
		a1.setSelected(true);
		a1.setBounds(10, 12, 90, 90);
		getContentPane().add(a1);
		botonesList.add(a1);
		
		JToggleButton a2 = new JToggleButton("");
		a2.setSelected(true);
		a2.setBounds(110, 12, 90, 90);
		getContentPane().add(a2);
		botonesList.add(a2);
		
		JToggleButton a3 = new JToggleButton("");
		a3.setSelected(true);
		a3.setBounds(210, 12, 90, 90);
		getContentPane().add(a3);
		botonesList.add(a3);
		
		JToggleButton a4 = new JToggleButton("");
		a4.setSelected(true);
		a4.setBounds(310, 12, 90, 90);
		getContentPane().add(a4);
		botonesList.add(a4);
		
		JToggleButton b1 = new JToggleButton("");
		b1.setSelected(true);
		b1.setForeground(Color.BLACK);
		b1.setBounds(10, 114, 90, 90);
		getContentPane().add(b1);
		botonesList.add(b1);
		
		JToggleButton b2 = new JToggleButton("");
		b2.setSelected(true);
		b2.setBounds(110, 114, 90, 90);
		getContentPane().add(b2);
		botonesList.add(b2);
		
		JToggleButton b3 = new JToggleButton("");
		b3.setSelected(true);
		b3.setBounds(210, 114, 90, 90);
		getContentPane().add(b3);
		botonesList.add(b3);
		
		JToggleButton b4 = new JToggleButton("");
		b4.setSelected(true);
		b4.setBounds(310, 114, 90, 90);
		getContentPane().add(b4);
		botonesList.add(b4);
		
		JToggleButton c1 = new JToggleButton("");
		c1.setSelected(true);
		c1.setBounds(10, 216, 90, 90);
		getContentPane().add(c1);
		botonesList.add(c1);
		
		JToggleButton c2 = new JToggleButton("");
		c2.setSelected(true);
		c2.setBounds(110, 216, 90, 90);
		getContentPane().add(c2);
		botonesList.add(c2);
		
		JToggleButton c3 = new JToggleButton("");
		c3.setSelected(true);
		c3.setBounds(210, 216, 90, 90);
		getContentPane().add(c3);
		botonesList.add(c3);
		
		JToggleButton c4 = new JToggleButton("");
		c4.setSelected(true);
		c4.setBounds(310, 216, 90, 90);
		getContentPane().add(c4);
		botonesList.add(c4);
		
		JToggleButton d1 = new JToggleButton("");
		d1.setSelected(true);
		d1.setBounds(10, 318, 90, 90);
		getContentPane().add(d1);
		botonesList.add(d1);
		
		JToggleButton d2 = new JToggleButton("");
		d2.setSelected(true);
		d2.setBounds(110, 318, 90, 90);
		getContentPane().add(d2);
		botonesList.add(d2);
		
		JToggleButton d3 = new JToggleButton("");
		d3.setSelected(true);
		d3.setBounds(210, 318, 90, 90);
		getContentPane().add(d3);
		botonesList.add(d3);
		
		JToggleButton d4 = new JToggleButton("");
		d4.setSelected(true);
		d4.setBounds(310, 318, 90, 90);
		getContentPane().add(d4);
		botonesList.add(d4);
		
		distribution = getDistribution(colores);
		asignarColores(botonesList, distribution);
		
		//No se ha conseguido implementar la lógica de forma correcta
		ActionListener checkPairs = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				giradas++; //cartas giradas se inicia a 0. Cuando se hace un click pasa a ser 1
				if (giradas == 2) { //Con el segundo click pasa a ser 2
					JToggleButton par1 = null, par2 = null; //Se crean 2 referencias a JToggleButton
					int index1 = -1, index2 = -1; //Indice del array donde estan almacenados los botones
					for (int i=0; i < botonesList.size(); i++) {
						if (botonesList.get(i).isEnabled() && !(botonesList.get(i).isSelected())) {
							par1 = botonesList.get(i); //Se asigna el primer boton habilitado y clicado
							index1=i;//se guarda el indice del array
						}
						if (botonesList.get(i).isEnabled() && !(botonesList.get(i).isSelected()) && !(botonesList.get(i).equals(par1))) {
							par2 = botonesList.get(i); //igual con el segundo
							index2 = i;
						}
					}
					if (par1.getBackground().equals(par2.getBackground())) {//Si los 2 botones del array tienen el mismo color se inhabilitan
						botonesList.get(index1).setEnabled(false);
						botonesList.get(index2).setEnabled(false);
						giradas = 0; //vuelve a haber 0 cartas giradas
					} else {
						botonesList.get(index1).setSelected(true);//Si no coinciden en color se vuelven a clicar
						botonesList.get(index2).setSelected(true);
						giradas = 0; //vuelve a haber 0 cartas giradas
						
					}
				}
			}
		};
		a1.addActionListener(checkPairs);a2.addActionListener(checkPairs);a3.addActionListener(checkPairs);a4.addActionListener(checkPairs);
		b1.addActionListener(checkPairs);b2.addActionListener(checkPairs);b3.addActionListener(checkPairs);b4.addActionListener(checkPairs);
		c1.addActionListener(checkPairs);c2.addActionListener(checkPairs);c3.addActionListener(checkPairs);c4.addActionListener(checkPairs);
		d1.addActionListener(checkPairs);d2.addActionListener(checkPairs);d3.addActionListener(checkPairs);d4.addActionListener(checkPairs);

		
	}
	//Metodos
	//Metodo que distrubuye las parejas de colores
	public static char[] getDistribution(char[] colores) {
		
		char[] distribucion = new char[16];
		int pareja; //pareja de cada color colocada
		
		for (int i=0; i < colores.length; i++) {
			pareja = 0;
			while (pareja == 0) {
				int j = (int) (rand.nextDouble()*16); //entero entre 0 y 16
				if (distribucion[j] == '\u0000') {
					distribucion[j] = colores[i]; //coloca el color en la casilla
					pareja++; //1 pareja ha sido colocada
				}
			}
			while (pareja == 1) {
				int j = (int) (rand.nextDouble()*16);
				if (distribucion[j] == '\u0000') {
					distribucion[j] = colores[i];
					pareja++;//segunda pareja colocada. Pasa a siguiente color
				}
			}
		}
		return distribucion;
	}
	//Metodo que asigna un color a cada boton
	public static void asignarColores(ArrayList<JToggleButton> botones, char[] distribucion) {
		for (int i=0; i < distribucion.length; i++) {
			switch (distribucion[i]){
			case ('r'):
				botones.get(i).setBackground(Color.RED);
			break;
			case ('g'):
				botones.get(i).setBackground(Color.GREEN);
			break;
			case ('b'):
				botones.get(i).setBackground(Color.BLUE);
			break;
			case ('y'):
				botones.get(i).setBackground(Color.YELLOW);
			break;
			case ('w'):
				botones.get(i).setBackground(Color.WHITE);
			break;
			case ('k'):
				botones.get(i).setBackground(Color.BLACK);
			break;
			case ('o'):
				botones.get(i).setBackground(Color.ORANGE);
			break;
			case ('m'):
				botones.get(i).setBackground(Color.MAGENTA);
			break;
			}	
		}
	}
}
