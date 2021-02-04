package navidad01;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author cheir
 */
public class Navidad01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Imc tuimc = new Imc(nombreEntrada, pesoEntrada, alturaEntrada);
		System.out.print("Tu IMC es: " + tuimc.redondeo(tuimc.calculaimc()) + " || ");
		System.out.println(tuimc.dx());

		// TODO code application logic here
	}

}
