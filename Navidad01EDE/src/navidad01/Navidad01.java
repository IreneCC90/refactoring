package navidad01;



/**
 *
 * @author cheir
 */
public class Navidad01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// tuimc es el objeto de la clase Imc
		Imc tuimc = new Imc();
		tuimc.pideDatos();
		System.out.print("Tu IMC es: " + tuimc.redondeo(tuimc.calculaimc()) + " || ");
		System.out.println(tuimc.dx());

		// TODO code application logic here
	}

}
