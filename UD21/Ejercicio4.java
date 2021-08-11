package UD21_First_maven_project.UD21;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		//configuracion del panel de la ventana
		setVisible(true);
		setTitle("Ejercicio 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//descripcion del componente
		JLabel labelEventos = new JLabel("Eventos:");
		labelEventos.setBounds(4, 11, 46, 14);
		contentPane.add(labelEventos);
		
		//componente area de texto
		TextArea textArea = new TextArea();
		textArea.setBounds(56, 10, 190, 209);
		contentPane.add(textArea);
		
		//captar eventos de ventana tipo cerrar, abrir, cambio de foco...
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				textArea.append("windowOpened \n");				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				textArea.append("windowIconified \n");				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				textArea.append("windowDeiconified \n");				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				textArea.append("windowDeactivated \n");				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				textArea.append("windowClosing \n");				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				textArea.append("windowClosed \n");
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				textArea.append("windowActivated \n");
			}
		});
		//Captar eventos tipo maximizar/minimizar
		this.addWindowStateListener(new WindowStateListener() {
			
			@Override
			public void windowStateChanged(WindowEvent e) {
				textArea.append("windowMaximized/Minimized \n");
			}
		});
		//Captar eventos del raton sobre la ventana
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.append("mouseReleased \n");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.append("mousePressed \n");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				textArea.append("mouseExited \n");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				textArea.append("mouseEntered \n");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.append("mouseClicked \n");
				
			}
		});
		//Capta el cambio de tamaño de la ventana
		this.addComponentListener(new ComponentAdapter() {
		    public void componentResized(ComponentEvent componentEvent) {
		    	//Condicional para que no muestre windowResized repetidas veces mientras se cambia el tamaño de ventana
		    	if (!(textArea.getText().subSequence(textArea.getText().length() - 15 , textArea.getText().length()).equals("windowResized \n"))) {
		    		 textArea.append("windowResized \n");
		    	}
		    }
		});
	}
}
