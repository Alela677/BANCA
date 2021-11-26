package mainAPP;

import java.util.Scanner;

public class mainAPP {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Menu principal

		Acceso();
		String opc = Menu();
		Logica(opc);

	}

	public static void Acceso() {

		String nombre;
		String dni;
		boolean acceso;

		System.out.println("BIENVENIDO");
		System.out.print("INTRODUZACA SU NOMBRE: ");
		nombre = sc.nextLine();

		System.out.print("INTRODUZACA SU DNI: ");
		dni = sc.nextLine();

	}

	public static String Menu() {

		String opc;
		System.out.println("A.Añadir persona\nB.Elegir persona\nC.Borrar persona\nD.Salir ");
		opc = sc.nextLine().toUpperCase();
		return opc;

	}

	public static void Logica(String opc) {

		switch (opc) {
		case "A":
			String nombre;
			System.out.print("Introduce el nobmre: ");
			nombre = sc.nextLine();
			System.out.print("Introduce el apellido:");

			break;
		case "B":

			switch (opc) {
			case "I":
				System.out.println("Cobrar sueldo");
				
				break;

			default:

			}

			break;

		case "C":

			break;

		case "D":

			System.exit(0);
			break;

		default:

		}

	}

}
