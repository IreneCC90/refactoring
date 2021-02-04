package navidad01;

import java.util.Scanner;

/**
 *
 * @author cheir
 */
public class Imc {
	private String nombre;
	private double peso;
	private double altura;

	Imc(String nombre, double peso, double altura) {// constructor param
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	Imc() {
		nombre = "Jane Doe";
		peso = 20.0;
		altura = 1.60;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double calculaimc() {
		return peso / (altura * altura);
	}

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
	}

	public static double redondeo(double redon) {
		return (double) Math.round(redon * 100d) / 100d;
	}
}
