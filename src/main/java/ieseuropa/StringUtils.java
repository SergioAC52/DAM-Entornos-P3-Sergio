package main.java.ieseuropa;

public class StringUtils {

	private static String repetirVeces(String string, int veces) {

		String texto = "";

		for (int i = 0; i < veces; i++) {

			texto = texto + " " + string;

		}

		return texto;

	}


}