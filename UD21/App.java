package UD21_First_maven_project.UD21;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String ejercicio = JOptionPane.showInputDialog("Revisar ejercicio 1,2,3,4,5,6,7");
    	switch (ejercicio) {
    	case "1":
        	Ejercicio1 ej1 = new Ejercicio1();
    	break;
    	case "2":
            Ejercicio2 ej2 = new Ejercicio2();
    	break;
    	case "3":
            Ejercicio3 ej3 = new Ejercicio3();
    	break;
    	case "4":
            Ejercicio4 ej4 = new Ejercicio4();
    	break;
    	case "5":
            Ejercicio5 ej5 = new Ejercicio5();
    	break;
    	case "6":
            Ejercicio6 ej6 = new Ejercicio6();
    	break;
    	case "7":
            Ejercicio7 ej7 = new Ejercicio7();
    	break;	
    	}

    }
}
