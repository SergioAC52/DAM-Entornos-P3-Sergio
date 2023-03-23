package main.java.ieseuropa;

public class StringUtils {
	
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
		
		System.out.print(ocurrencias("hola",'a'));
		
		
	}

}
