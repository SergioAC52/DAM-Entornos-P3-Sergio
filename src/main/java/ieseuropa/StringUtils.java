
package main.java.ieseuropa;

public class StringUtils {
	
	private static String repetirVeces(String string, int veces) {

		String texto = "";

		for (int i = 0; i < veces; i++) {

			texto = texto + " " + string;

		}
		
		return texto;
	}



	private static String repetirTodo(String palabra) {

		String resultado = "";

		for (int i = 0; i < palabra.length(); i++) {

			for (int j = 0; j < 2; j++) {

				resultado = resultado + palabra.charAt(i);

			}


		}

		return resultado;
	}

	private static int ocurrencias(String palabra, char letra) {

		int contador = 0;

		for (int i = 0; i < palabra.length(); i++) {

			if (palabra.charAt(i) == letra) {

				contador++;

			}

		}

		return contador;
	}
	
	private static String mayus(String palabra) {

		return palabra.toUpperCase();

	}

	private static String minus(String palabra) {

		return palabra.toLowerCase();

	}
	private static int calcularLongitud(String texto) {
		String textoModificado = texto.replace(" ", "");
		return textoModificado.length();
	}
	
	public static void main(String[] args) {

		System.out.println(repetirTodo("hola"));
		System.out.print(ocurrencias("hola",'a'));
		System.out.print(repetirVeces("hola",5));
		System.out.println(mayus("hola"));
		System.out.println(minus("HOLA"));
		System.out.println(calcularLongitud("amijos"));
	}
	


	
}

