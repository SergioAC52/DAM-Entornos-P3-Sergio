package main.java.ieseuropa;

public class StringUtils {

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
	public static void main(String[] args) {

		System.out.println(repetirTodo("hola"));
		System.out.print(ocurrencias("hola",'a'));

	}

}