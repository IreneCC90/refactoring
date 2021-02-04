package navidad01;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author cheir
 */
public class Imc {
	// objeto tipo String nombre
	private String nombre;
	// objeto tipo double peso
	private double peso;
	// objeto tipo double altura
	private double altura;

	// constructor param
	Imc(String nombre, double peso, double altura) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	// constructor por defecto
	Imc() {
		nombre = "Jane Doe";
		peso = 20.0;
		altura = 1.60;
	}
	// método público setter
	// variable de entrada tipo double
	public void setPeso(double peso) {
		this.peso = peso;
	}
	// método público setter
	// variable de entrada tipo double
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/* método público getter
	@return String */
	public String getNombre() {
		return nombre;
	}
	/* método público getter
	@return double */
	public double getPeso() {
		return peso;
	}
	/* método público getter
	@return double */
	public double getAltura() {
		return altura;
	}
	/* método público calculaimc
	@return double */
	public double calculaimc() {
		return peso / (altura * altura);
	}
	/* método público String dx
	@return String */
	public String dx() {
		double imc = calculaimc();
		String mensaje = "";
		if (imc < 10) {
			mensaje = "Estas muehto.";
		} else if (imc < 16) {
			mensaje = "Ves al hospital urgentemente.";
		} else if (imc >= 16 && imc < 17) {
			mensaje = "Infrapeso, come un bocata de chorizo.";
		} else if (imc >= 17 && imc < 18) {
			mensaje = "Bajo peso, un donuts te vendra bien.";
		} else if (imc >= 18 && imc < 25) {
			mensaje = "Peso normal.Estas sanote.";
		} else if (imc >= 25 && imc < 30) {
			mensaje = "Sobrepeso. Obesidad Grado I. Ojo cuidao.";
		} else if (imc >= 30 && imc < 35) {
			mensaje = "Sobrepero cronico. Obesidad Grado II. Tas pasao.";
		} else if (imc >= 35 && imc < 40) {
			mensaje = "Obesidad premorbida. Obesidad Grado III.";
		} else {
			mensaje = "Obesidad morbida. Obesidad Grado IV.";
		}
		return mensaje;
	}
	// método public return void
	public void pideDatos() {
		String nombreEntrada = "";
		double pesoEntrada;
		double alturaEntrada;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenid@. Introduce tus datos");
		System.out.println("Introduce tu nombre: ");
		nombreEntrada = entrada.nextLine();
		System.out.println("Introduce tu peso: ");
		pesoEntrada = entrada.nextDouble();
		System.out.println("Introduce tu altura: ");
		alturaEntrada = entrada.nextDouble();
		this.nombre = nombreEntrada;
		this.peso = pesoEntrada;
		this.altura = alturaEntrada;
	}
	// método public return double
	public double redondeo(double redon) {
		return (double) Math.round(redon * 100d) / 100d;
	}
}
