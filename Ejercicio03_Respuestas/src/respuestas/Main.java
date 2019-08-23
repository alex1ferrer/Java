package respuestas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int bien = 0;
		int mal = 0;
		int notafinal;
		String respuesta;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce las 10 correcciones: ");
		for (int x = 0; x < 10; x++) {
			respuesta = reader.next();
			if (!respuesta.equalsIgnoreCase("B") && !respuesta.equalsIgnoreCase("M")) {
				System.out.println("Error, debes introducir bien('B/b') o mal(M/m')");
				x--;
			} else if (respuesta.equalsIgnoreCase("B")) {
				bien++;
			} else {
				mal++;
			}

		}
		notafinal = bien - mal / 3;
		System.out.println("Total acertadas: " + bien + " (" + bien + " puntos)");
		System.out.println("Total incorrectas : " + mal + " (-" + mal / 3 + " puntos)");
		System.out.println("Nota final: " + notafinal);
	}

}