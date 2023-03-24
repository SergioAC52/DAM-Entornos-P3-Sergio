
package main.java.ieseuropa;

import java.util.ArrayList;

public class numeros {

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

	}

}
