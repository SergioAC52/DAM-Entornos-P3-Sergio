
package main.java.ieseuropa;

import java.util.ArrayList;

public class numeros {

	private static String Pell() {

		String resultado = "";

		int numeroPrec = 2;

		int numeroAnte = 1;

		for (int i = 1; i < 16; i++) {

			int aux = numeroAnte;

			numeroAnte = numeroPrec;

			numeroPrec = aux + (2 * (numeroPrec));

			resultado = resultado + " " + numeroPrec;


		}
		return resultado;
	}


	public static boolean suerte(int numero) {

		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= numero; i++) {
			numeros.add(i);
		}

		int contador = 1;
		while (contador < numeros.size()) {
			for (int j = contador; j < numeros.size(); j += contador) {
				numeros.remove(j);

			}
			contador++;
		}

		if (numeros.contains(numero)) {

			return true;

		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(suerte(25));
		System.out.print(Pell());
	}

}
