package ejercicio02;

public class Main {

	public static void main(String[] args) {

		int lado = 6;
		int lado_tmp = lado;
		int max = lado * 2 - 1;
		int espacios = lado - 1;

		for (int i = 0; i < max; i++) {

			for (int e = 0; e < espacios; e++) {
				System.out.print(" ");
			}

			for (int a = 0; a < lado_tmp; a++) {
				System.out.print("*");
			}

			if (i >= lado - 1) {
				lado_tmp -= 2;
				espacios++;
			} else {
				lado_tmp += 2;
				espacios--;
			}

			System.out.println();
		}

	}

}