package claseescaner;

import java.util.Scanner;

public class InforPersonal {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre, apellido;
		int edad; double peso;
		System.out.println("Dale dale ya te la sabes, ingresame tu nombre: ");
		nombre = lector.next();
		System.out.println("Tu apellido: ");
		apellido = lector.next();
		System.out.println("Tu edad: ");
		edad = lector.nextInt();
		System.out.println("Ingresa el peso: ");
		peso = lector.nextDouble();
		
		System.out.println("Su nombre es " + nombre + " " + apellido);
		System.out.println("Edad = " + edad);
		System.out.println("Peso = " + peso + " libras");
		lector.close();
	}

	


}
