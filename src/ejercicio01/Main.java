package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int nota_tema2, nota_tema4, nota_diciembre;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la nota de la práctica 2: ");
		nota_tema2 = scanner.nextInt();
		System.out.print("Introduce la nota de la práctica 4: ");
		nota_tema4 = scanner.nextInt();
		System.out.print("Introduce la nota del examen: ");
		nota_diciembre = scanner.nextInt();

		if (nota_tema2 >= 3 && nota_tema4 >= 3 && media(nota_tema2, nota_tema4) >= 4 && nota_diciembre >= 4) {
			System.out.println("Puedes aprobar la evaluación");
		} else if (nota_tema2 < 3 || nota_tema4 < 3 || media(nota_tema2, nota_tema4) < 4 || nota_diciembre >= 4) {
			System.out.println("Debes recuperar las prácticas");
		} else if (nota_diciembre < 4 && nota_tema2 >= 3 && nota_tema4 >= 3 && media(nota_tema2, nota_tema4) >= 4) {
			System.out.println("Debes recuperar el examen");
		} else {
			System.out.println("Debes recuperarlo todo");
		}
	}

	public static int suma(int num1, int num2) {
		return num1 + num2;
	}

	public static int media(int num1, int num2) {
		return suma(num1, num2) / 2;
	}

}